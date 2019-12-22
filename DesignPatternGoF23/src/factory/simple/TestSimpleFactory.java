package factory.simple;

/**
 * 测试简单工厂
 * 
 * @author beeworkshop
 *
 */
public class TestSimpleFactory {
	public static void main(String[] args) {
		Car c1 = CarFactory01.createCar("奥迪");
		Car c2 = CarFactory01.createCar("比亚迪");

		// 为什么不可以把具体的车做成一个类呢？这样就不用分支结构进行判断。
		// 新增一种车只需新增一个类即可，不用修改已有代码。

		c1.run();
		c2.run();

	}
}
