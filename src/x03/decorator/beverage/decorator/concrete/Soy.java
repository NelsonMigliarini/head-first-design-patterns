package x03.decorator.beverage.decorator.concrete;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.decorator.CondimentDecorator;

/**
 * @author Nelson Migliarini
 */
public class Soy extends CondimentDecorator {

	/**
	 * @param beverage
	 */
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch(beverage.getSize()) {
			case TALL: 
				cost += .10;
				break;
			case GRANDE: 
				cost += .15;
				break;
			default: 
				cost += .20;
		}
		return cost;
	}
}
