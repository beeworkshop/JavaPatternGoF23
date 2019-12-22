package singleton;

/**
 * 懒汉式单例模式
 * 
 * @author beeworkshop
 *
 */
public class SingletonLazy {

	// 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonLazy instance;

	private SingletonLazy() { // 私有化构造器
	}

	// 方法同步，调用效率低！
	public static synchronized SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

}