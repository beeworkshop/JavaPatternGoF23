package adapter;

public class Client {

	public void test1(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		Client c = new Client();

		Adaptee a = new Adaptee();

		Target t = new Adapter(a);

		c.test1(t);

	}

}