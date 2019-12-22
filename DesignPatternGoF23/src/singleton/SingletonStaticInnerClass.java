package singleton;

/**
 * 静态内部类实现单例模式
 * 
 * 这种方式：线程安全，调用效率高，并且实现了延时加载（lazy loading）！
 * 
 * @author beeworkshop
 *
 */
public class SingletonStaticInnerClass {

	private static class SingletonClassInstance {// 静态内部类延时加载
		private static final SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
	}// final可以不用加，效果也是不能改

	private SingletonStaticInnerClass() {
	}

	// 方法没有同步，调用效率高！
	public static SingletonStaticInnerClass getInstance() {
		return SingletonClassInstance.instance; // 在这里才加载静态内部类
	}

}