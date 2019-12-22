package singleton;

public class Test1 {

	public static void main(String[] args) {
		SingletonStaticInnerClass s1 = SingletonStaticInnerClass.getInstance();
		SingletonStaticInnerClass s2 = SingletonStaticInnerClass.getInstance();

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(SingletonEnum.INSTANCE == SingletonEnum.INSTANCE);

	}
}