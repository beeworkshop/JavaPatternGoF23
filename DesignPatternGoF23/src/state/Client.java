package state;

public class Client {
	public static void main(String[] args) {
		RoomContext ctx = new RoomContext();

		ctx.setState(new FreeState());
		ctx.setState(new BookedState());

	}
}