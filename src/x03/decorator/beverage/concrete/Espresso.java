package x03.decorator.beverage.concrete;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.Size;

/**
 * @author Nelson Migliarini
 */
public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";		
	}
	
	public Espresso(Size size) {
		this();
		this.size = size;
	}

	@Override
	public double cost() {
		double cost;
		switch(size) {
			case TALL: 
				cost = 2;
				break;
			case GRANDE: 
				cost = 3;
				break;
			default: 
				cost = 3.5;
		}
		return cost;
	}
}
