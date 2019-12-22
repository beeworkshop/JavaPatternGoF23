package factory.method;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
