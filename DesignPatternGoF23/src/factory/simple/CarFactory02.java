package factory.simple;

/**
 * 新增车型也需要修改代码（新增代码）
 * 
 * @author beeworkshop
 *
 */
public class CarFactory02 {

	public static Car createAudi() {
		return new Audi();
	}

	public static Car createByd() {
		return new Byd();
	}

}