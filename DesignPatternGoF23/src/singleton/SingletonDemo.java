package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * 
 * @author beeworkshop
 *
 */
public class SingletonDemo implements Serializable {
	// 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonDemo instance;

	private SingletonDemo() { // 私有化构造器
		if (instance != null) {
			throw new RuntimeException();
		}
	}

	// 方法同步，调用效率低！
	public static synchronized SingletonDemo getInstance() {
		if (instance == null) {
			instance = new SingletonDemo();
		}
		return instance;
	}

	// 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}

}