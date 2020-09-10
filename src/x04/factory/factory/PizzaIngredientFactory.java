package x04.factory.factory;

import x04.factory.ingredients.cheese.Cheese;
import x04.factory.ingredients.clam.Clam;
import x04.factory.ingredients.dough.Dough;
import x04.factory.ingredients.sauce.Sauce;

/**
 * @author Nelson Migliarini
 */
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clam createClam();
}
