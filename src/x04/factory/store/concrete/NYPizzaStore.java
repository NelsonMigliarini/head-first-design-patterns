package x04.factory.store.concrete;

import x04.factory.factory.PizzaIngredientFactory;
import x04.factory.factory.concrete.NYPizzaIngredientFactory;
import x04.factory.pizza.Pizza;
import x04.factory.pizza.concrete.CheesePizza;
import x04.factory.pizza.concrete.ClamPizza;
import x04.factory.store.PizzaStore;

/**
 * @author Nelson Migliarini
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		return pizza;
	}
}
