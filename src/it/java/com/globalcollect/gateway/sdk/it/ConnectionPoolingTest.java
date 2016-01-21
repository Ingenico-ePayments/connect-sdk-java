package com.globalcollect.gateway.sdk.it;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import com.globalcollect.gateway.sdk.java.GcCommunicator;
import com.globalcollect.gateway.sdk.java.GcDefaultConfiguration;
import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ConvertAmountParams;

public class ConnectionPoolingTest extends ItTest {

	@Test
	public void testConnectionPoolingMaxIsRequestCount() throws Exception {
		testConnectionPooling(10, 10);
	}

	@Test
	public void testConnectionPoolingMaxIsHalfRequestCount() throws Exception {
		testConnectionPooling(10, 5);
	}

	@Test
	public void testConnectionPoolingMaxIsOne() throws Exception {
		testConnectionPooling(10, 1);
	}

	private void testConnectionPooling(int requestCount, int maxConnections) throws Exception {

		ExecutorService executorService = Executors.newFixedThreadPool(requestCount);
		try {

			GcDefaultConfiguration defaultConfiguration = getDefaultConfiguration();
			defaultConfiguration.setMaxConnections(maxConnections);
			GcCommunicator communicator = GcFactory.createCommunicator(defaultConfiguration);
			try {

				testConnectionPooling(executorService, communicator, requestCount);

			} finally {
				communicator.close();
			}

		} finally {
			executorService.shutdown();
		}
	}

	private void testConnectionPooling(ExecutorService executorService, GcCommunicator communicator, int requestCount) throws Exception {

		List<Future<ConvertAmountResult>> futures = new ArrayList<Future<ConvertAmountResult>>(requestCount);
		CountDownLatch barrier = new CountDownLatch(1);
		for (int i = 0; i < requestCount; i++) {
			Future<ConvertAmountResult> future = executorService.submit(new ConvertAmountAction(barrier, i, communicator));
			futures.add(future);
		}
		barrier.countDown();

		List<ConvertAmountResult> results = new ArrayList<ConnectionPoolingTest.ConvertAmountResult>(requestCount);
		for (Future<ConvertAmountResult> future : futures) {
			results.add(future.get());
		}
		// actual concurrent use of connections will need to be verified in the server logs
	}

	private static final class ConvertAmountAction implements Callable<ConvertAmountResult> {

		private final CountDownLatch barrier;
		private final GcCommunicator communicator;
		private final ConvertAmountParams request;

		private ConvertAmountAction(CountDownLatch barrier, int index, GcCommunicator communicator) {
			this.barrier = barrier;
			this.communicator = communicator;

			request = new ConvertAmountParams();
			request.setSource("USD");
			request.setTarget("EUR");
			request.setAmount(100L * (index + 1));
		}

		@Override
		public ConvertAmountResult call() throws Exception {

			barrier.await();

			long startTime = System.currentTimeMillis();
			GcFactory.createClient(communicator).withClientMetaInfo("").merchant("9991").services().convertAmount(request).getConvertedAmount();
			long endTime = System.currentTimeMillis();

			return new ConvertAmountResult(startTime, endTime);
		}
	}

	private static final class ConvertAmountResult {

		@SuppressWarnings("unused")
		private final long startTime;
		@SuppressWarnings("unused")
		private final long endTime;

		private ConvertAmountResult(long startTime, long endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}
	}
}
