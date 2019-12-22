package memento;

/**
 * 负责人类
 * 
 * 负责管理备忘录对象
 * 
 * @author beeworkshop
 *
 */
public class CareTaker {

	// 保存一次
	private EmpMemento memento;

	// 保存多次
//	private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}