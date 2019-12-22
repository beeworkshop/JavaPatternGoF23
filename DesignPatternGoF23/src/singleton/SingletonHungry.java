package singleton;

/**
 * 饿汉式单例模式
 * 
 * @author beeworkshop
 *
 */
public class SingletonHungry {

	// 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingletonHungry instance = new SingletonHungry();

	private SingletonHungry() {
	}

	// 方法没有同步，调用效率高！
	public static SingletonHungry getInstance() {
		return instance;
	}

}