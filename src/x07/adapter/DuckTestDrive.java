package x07.adapter;

import x07.adapter.adapter.TurkeyAdapter;
import x07.adapter.duck.Duck;
import x07.adapter.duck.MallardDuck;
import x07.adapter.turkey.WildTurkey;

/**
 * @author Nelson Migliarini
 */
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
