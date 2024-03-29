package observer1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<Observer>();

	public void registerObserver(Observer obs) {
		list.add(obs);
	}

	public void removeObserver(Observer obs) {
		list.remove(obs);
	}

	// 通知所有的观察者更新状态
	public void notifyAllObservers() {
		for (Observer obs : list) {
			// 这里的this把Subject传给Observer。Observer持有Subject后调用Subject.states来更新Observer自己的states
			obs.update(this);
		}
	}

}