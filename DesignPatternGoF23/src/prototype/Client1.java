package prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 * 
 * @author beeworkshop
 *
 */
public class Client1 {
	public static void main(String[] args) throws Exception {
		Date date = new Date(12312321331L);
		Sheep1 s1 = new Sheep1("少利", date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());

		date.setTime(23432432423L);

		System.out.println(s1.getBirthday());

		Sheep1 s2 = (Sheep1) s1.clone();
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());

	}
}
