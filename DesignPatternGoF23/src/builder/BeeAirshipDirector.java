package builder;

public class BeeAirshipDirector implements AirShipDirector {

	// 组装者/编排器（Director）通过调用构建者（Builder）完成飞船的整装。
	private AirShipBuilder builder;

	public BeeAirshipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();

		// 装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);

		return ship;
	}

}