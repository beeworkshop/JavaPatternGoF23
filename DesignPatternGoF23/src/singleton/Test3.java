package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种创建单例模式的效率
 * 
 * @author beeworkshop
 *
 */
public class Test3 {

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {

					for (int i = 0; i < 1000000; i++) {
//						Object o = Singleton*.getInstance();
						Object o = SingletonEnum.INSTANCE;
					}

					countDownLatch.countDown(); // 内部类调用外部的变量，需要将其final变成常量。
				}
			}).start();
		}

		countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行！

		long end = System.currentTimeMillis();
		System.out.println("总耗时：" + (end - start));
	}
}