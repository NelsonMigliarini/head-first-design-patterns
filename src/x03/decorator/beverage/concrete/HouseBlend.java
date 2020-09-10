package x03.decorator.beverage.concrete;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.Size;

/**
 * @author Nelson Migliarini
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		this.description = "House Blend Coffee";
	}
	
	public HouseBlend(Size size) {
		this();
		this.size = size;
	}
	
	@Override
	public double cost() {
		double cost;
		switch(size) {
			case TALL: 
				cost = .90;
				break;
			case GRANDE: 
				cost = 1.35;
				break;
			default: 
				cost = 1.70;
		}
		return cost;
	}
}
