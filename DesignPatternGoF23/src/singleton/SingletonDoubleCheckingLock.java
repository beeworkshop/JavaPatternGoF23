package singleton;

/**
 * 双重检查锁实现单例模式
 * 
 * 由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题。不建议使用。
 * 
 * @author beeworkshop
 *
 */
public class SingletonDoubleCheckingLock {

	private static SingletonDoubleCheckingLock instance = null;

	public static SingletonDoubleCheckingLock getInstance() {
		if (instance == null) {
			SingletonDoubleCheckingLock sc;
			// 对同步块细粒度化
			// 只有第一次才同步，之后创建对象后就没必要同步了。
			synchronized (SingletonDoubleCheckingLock.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDoubleCheckingLock.class) {
						if (sc == null) {
							sc = new SingletonDoubleCheckingLock();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}

	private SingletonDoubleCheckingLock() {

	}

}