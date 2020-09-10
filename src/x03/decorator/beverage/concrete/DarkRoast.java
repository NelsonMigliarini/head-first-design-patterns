package x03.decorator.beverage.concrete;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.Size;

/**
 * @author Nelson Migliarini
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Dark Roast Coffe";		
	}
	
	public DarkRoast(Size size) {
		this();
		this.size = size;
	}

	@Override
	public double cost() {
		double cost;
		switch(size) {
			case TALL: 
				cost = 1;
				break;
			case GRANDE: 
				cost = 1.5;
				break;
			default: 
				cost = 1.8;
		}
		return cost;
	}
}
