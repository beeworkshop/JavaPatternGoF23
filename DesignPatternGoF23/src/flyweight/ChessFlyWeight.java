package flyweight;

/**
 * 享元类
 * 
 * @author beeworkshop
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);

	String getColor();

	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {

	private String color; // 记录内部特性（共享）

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色：" + color);
		// 可以使用属性将外部特性（类对象的引用）组合进来
		System.out.println("棋子位置：" + c.getX() + "----" + c.getY());
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

}