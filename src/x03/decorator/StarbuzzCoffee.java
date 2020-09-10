package x03.decorator;

import x03.decorator.beverage.Beverage;
import x03.decorator.beverage.Size;
import x03.decorator.beverage.concrete.DarkRoast;
import x03.decorator.beverage.concrete.Espresso;
import x03.decorator.beverage.concrete.HouseBlend;
import x03.decorator.beverage.decorator.concrete.Mocha;
import x03.decorator.beverage.decorator.concrete.Soy;
import x03.decorator.beverage.decorator.concrete.Whip;

/**
 * @author Nelson Migliarini
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage espresso = new Espresso(Size.VENTI);
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

		Beverage houseBlendA = new HouseBlend(Size.GRANDE);
		houseBlendA = new Soy(houseBlendA);
		houseBlendA = new Mocha(houseBlendA);
		houseBlendA = new Whip(houseBlendA);
		System.out.println(houseBlendA.getDescription() + " $" + houseBlendA.cost());
	}
}
