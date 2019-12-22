package factory.simple;

public class CarFactory01 {

	/**
	 * 选择结构导致每新增一种车就需要修改代码——增加选择分支
	 * 
	 * @param type
	 * @return
	 */
	public static Car createCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("比亚迪".equals(type)) {
			return new Byd();
		} else {
			return null;
		}
	}
}
