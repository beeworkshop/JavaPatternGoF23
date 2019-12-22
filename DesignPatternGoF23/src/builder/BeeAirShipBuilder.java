package builder;

public class BeeAirShipBuilder implements AirShipBuilder {
	// StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建欲望号发动机！");
		return new Engine("欲望号发动机！");
	}

	@Override
	public EscapeTower builderEscapeTower() {

		System.out.println("构建逃逸塔");
		return new EscapeTower("欲望号逃逸塔");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("欲望号轨道舱");
	}

}