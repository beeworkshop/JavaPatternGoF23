package factory.abstractfac;

public interface CarFactory {
	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}