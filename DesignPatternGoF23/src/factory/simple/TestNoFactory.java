package factory.simple;

/**
 * 测试在没有工厂模式的情况下
 * 
 * @author beeworkshop
 *
 */
public class TestNoFactory {

	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();

		c1.run();
		c2.run();
	}
}
