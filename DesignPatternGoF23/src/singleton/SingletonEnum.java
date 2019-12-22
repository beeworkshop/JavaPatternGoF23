package singleton;

/**
 * 枚举式实现单例模式(没有延时加载)
 * 
 * 可以天然地防止反射和反序列化漏洞！
 * 
 * @author beeworkshop
 *
 */
public enum SingletonEnum {

	// 这个枚举元素，本身就是单例对象！
	INSTANCE;

	// 添加自己需要的操作！
	public void singletonOperation() {
	}

}