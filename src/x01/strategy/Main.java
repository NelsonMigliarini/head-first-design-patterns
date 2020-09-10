package x01.strategy;

import x01.strategy.duck.ConcreteDuck;
import x01.strategy.duck.Duck;
import x01.strategy.duck.behavior.fly.FlyNoWay;
import x01.strategy.duck.behavior.fly.FlyWithWings;
import x01.strategy.duck.behavior.quack.Quack;
import x01.strategy.duck.behavior.quack.Squeak;

/**
 * @author Nelson Migliarini
 */
public class Main {

	public static void main(String[] args) {
		Duck duck = new ConcreteDuck(new FlyWithWings(), new Quack());
		
		System.out.println(duck.performFly());
		System.out.println(duck.performQuack());
		
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new Squeak());
		
		System.out.println(duck.performFly());
		System.out.println(duck.performQuack());
	}
}
