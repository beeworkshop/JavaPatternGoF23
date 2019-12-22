package factory.method;

/**
 * 新增车型不需要修改原有的代码（分支选择结构）
 * 
 * 直接加个新车型的工厂方法类即可（当然还有新车型类）——增加了工作量。
 * 
 * 这样就只存在代码的新增，不存在对已有代码的修改，满足OCP。
 * 
 * @author beeworkshop
 *
 */
public class LamborghiniFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Lamborghini();
	}

}
