package chainOfResponsibility;

/**
 * 抽象类描述处理事务的下一个/下一级对象
 * 
 * @author beeworkshop
 *
 */
public abstract class Leader { // 注意抽象类可以带属性，而接口不行（只有常量属性）
	protected String name;
	protected Leader nextLeader; // 责任链上的后继对象，有点像链表

	public Leader(String name) {
		super();
		this.name = name;
	}

	// 设定责任链上的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请求的核心的业务方法
	 * 
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);

}