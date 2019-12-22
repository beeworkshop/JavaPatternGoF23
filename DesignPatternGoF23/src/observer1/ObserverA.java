package observer1;

public class ObserverA implements Observer {

	private int myState; // myState需要跟目标对象的state值保持一致！即Observer.myState=Subject.state

	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject) subject).getState();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

}