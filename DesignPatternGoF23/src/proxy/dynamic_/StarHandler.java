package proxy.dynamic_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK自带动态代理实现AOP
 * 
 * @author beeworkshop
 *
 */
public class StarHandler implements InvocationHandler {

	Star realStar;

	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	/**
	 * 所有的业务逻辑都在这里处理
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;

		/**
		 * 在此处统一做访问控制
		 */

		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");

		if (method.getName().equals("sing")) {
			object = method.invoke(realStar, args);
		}

		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		return object;
	}

}