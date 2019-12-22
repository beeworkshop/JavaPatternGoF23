package state;

/**
 * 空闲状态
 * 
 * @author beeworkshop
 *
 */
public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房间空闲，可以直接入住，也可以预订。");
	}

}