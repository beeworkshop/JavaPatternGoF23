package state;

/**
 * 房间对象
 * 
 * 记录当前房间所处的状态
 * 
 * @author beeworkshop
 *
 */
public class RoomContext {
	// 如果是银行系统，这个Context类就是账号。根据金额不同，切换到不同的状态！

	private State state; // 记录房间当前的状态

	public void setState(State s) {
		System.out.println("修改状态！");
		state = s;
		state.handle(); // 调用当前状态对应的行为。利用接口的抽象方法实现多态。
	}

}