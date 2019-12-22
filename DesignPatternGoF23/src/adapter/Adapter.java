package adapter;

/**
 * 配器 (对象适配器方式,使用了组合的方式跟被适配对象整合)
 * 
 * 使用组合方式可以替代类的继承方式，而组合方式更灵活。
 * 
 * @author beeworkshop
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	@Override
	public void handleReq() {
		adaptee.request();
	}

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}