package strategy;

/**
 * 通过接口的抽象方法实现多态
 * 
 * @author beeworkshop
 *
 */
public interface Strategy {
	public double getPrice(double standardPrice);
}