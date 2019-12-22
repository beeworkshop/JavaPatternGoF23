package state;

/**
 * 已入住状态
 * 
 * @author beeworkshop
 *
 */
public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间有人已入住，可以续房，也可以退房。");
	}

}