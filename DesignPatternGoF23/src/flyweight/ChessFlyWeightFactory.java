package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 
 * @author beeworkshop
 *
 */
public class ChessFlyWeightFactory {
	// 享元池
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

	public static ChessFlyWeight getChess(String color) {

		if (map.get(color) != null) { // 有对象就直接从享元池中取出来
			return map.get(color);
		} else { // 没有就新建一个对象
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}

	}

}
