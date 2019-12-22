package templateMethod;

public abstract class BankTemplateMethod {
	// 具体方法，可以延迟到子类中去实现
	public void takeNumber() {
		System.out.println("取号排队");
	}

	// 利用抽象类抽象方法的多态特性
	public abstract void transact(); // 办理具体的业务。钩子方法。

	// 具体方法，可以延迟到子类中去实现
	public void evaluate() {
		System.out.println("反馈评分");
	}

	// 模版方法，子类不能重写
	// 这里体现“模板”的概念——固定不变的步骤/流程，但具体实现不知道——延迟到子类中去实现。
	public final void process() { // 模板方法！！！
		System.out.println("==============================");
		this.takeNumber();

		// 由父类完全控制流程/步骤
		this.transact(); // 像个钩子。执行时，挂哪个子类的方法就调用哪个。

		this.evaluate();
	}

}