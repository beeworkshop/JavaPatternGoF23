package proxy.static_;

public class ProxyStar implements Star {

	private Star star;

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()"); // 代理的事务
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()"); // 代理的事务
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()"); // 代理的事务
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()"); // 代理的事务
	}

	@Override
	public void sing() {
		star.sing(); // 只有唱歌没法代理，需要真实角色去完成。
	}

}
