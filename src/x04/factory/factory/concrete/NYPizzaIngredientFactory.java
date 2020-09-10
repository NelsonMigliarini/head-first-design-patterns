package x04.factory.factory.concrete;

import x04.factory.factory.PizzaIngredientFactory;
import x04.factory.ingredients.cheese.Cheese;
import x04.factory.ingredients.cheese.concrete.ReggianoCheese;
import x04.factory.ingredients.clam.Clam;
import x04.factory.ingredients.clam.concrete.FreshClams;
import x04.factory.ingredients.dough.Dough;
import x04.factory.ingredients.dough.concrete.ThinCrustDough;
import x04.factory.ingredients.sauce.Sauce;
import x04.factory.ingredients.sauce.concrete.MarinaraSauce;

/**
 * @author Nelson Migliarini
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clam createClam() {
		return new FreshClams();
	}
	
	@Override
	public String toString() {
		return "New York pizza ingredients: ";
	}
}
