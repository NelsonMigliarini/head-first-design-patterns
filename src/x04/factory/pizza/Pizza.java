package x04.factory.pizza;

import x04.factory.ingredients.cheese.Cheese;
import x04.factory.ingredients.clam.Clam;
import x04.factory.ingredients.dough.Dough;
import x04.factory.ingredients.sauce.Sauce;

/**
 * @author Nelson Migliarini
 */
public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clam clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350°");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
}
