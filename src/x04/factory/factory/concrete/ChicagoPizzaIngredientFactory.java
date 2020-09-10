package x04.factory.factory.concrete;

import x04.factory.factory.PizzaIngredientFactory;
import x04.factory.ingredients.cheese.Cheese;
import x04.factory.ingredients.cheese.concrete.MozzarellaCheese;
import x04.factory.ingredients.clam.Clam;
import x04.factory.ingredients.clam.concrete.FrozenClams;
import x04.factory.ingredients.dough.Dough;
import x04.factory.ingredients.dough.concrete.ThickCrustDough;
import x04.factory.ingredients.sauce.Sauce;
import x04.factory.ingredients.sauce.concrete.PlumTomatoSauce;

/**
 * @author Nelson Migliarini
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Clam createClam() {
		return new FrozenClams();
	}
	
	@Override
	public String toString() {
		return "Chicago pizza ingredients: ";
	}
}
