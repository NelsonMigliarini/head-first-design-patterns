package x04.factory.pizza.concrete;

import x04.factory.factory.PizzaIngredientFactory;
import x04.factory.pizza.Pizza;

/**
 * @author Nelson Migliarini
 */
public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientFactory = ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

	@Override
	public String toString() {
		return "" + ingredientFactory + dough + sauce + cheese + clam;
	}
}
