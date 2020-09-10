package x03.decorator.beverage.decorator;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.Size;

/**
 * @author Nelson Migliarini
 */
public abstract class CondimentDecorator extends Beverage {
	
	protected Beverage beverage;	
	@Override
	public abstract String getDescription();
	
	@Override
	public Size getSize() {
		return beverage.getSize();
	}
}
