package x03.decorator.beverage.decorator.concrete;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.decorator.CondimentDecorator;

/**
 * @author Nelson Migliarini
 */
public class Mocha extends CondimentDecorator {

	/**
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch(beverage.getSize()) {
			case TALL: 
				cost += .20;
				break;
			case GRANDE: 
				cost += .30;
				break;
			default: 
				cost += .35;
		}
		return cost;
	}
}
