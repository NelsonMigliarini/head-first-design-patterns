package x04.factory;

import x04.factory.store.PizzaStore;
import x04.factory.store.concrete.ChicagoPizzaStore;
import x04.factory.store.concrete.NYPizzaStore;

/**
 * @author Nelson Migliarini
 */
public class Main {
	
	public static void main(String[] args) {
		PizzaStore chicagoPizza = new ChicagoPizzaStore();
		PizzaStore nyPizza = new NYPizzaStore();
		
		System.out.println(chicagoPizza.orderPizza("cheese") + "\n");
		System.out.println(chicagoPizza.orderPizza("clam") + "\n");
		System.out.println(nyPizza.orderPizza("cheese") + "\n");
		System.out.println(nyPizza.orderPizza("clam") + "\n");
	}
}
