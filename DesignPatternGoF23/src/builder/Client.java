package builder;

public class Client {
	public static void main(String[] args) {

		AirShipDirector director = new BeeAirshipDirector(new BeeAirShipBuilder());

		AirShip ship = director.directAirShip();

		System.out.println(ship.getEngine().getName());

		ship.launch();

	}
}