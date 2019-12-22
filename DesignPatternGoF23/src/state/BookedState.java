package state;

/**
 * 已预订状态
 * 
 * @author beeworkshop
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订，可以入住，也可以取消预订。");
	}

}