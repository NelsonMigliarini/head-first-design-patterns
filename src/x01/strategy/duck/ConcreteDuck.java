package x01.strategy.duck;

import x01.strategy.duck.behavior.FlyBehavior;
import x01.strategy.duck.behavior.QuackBehavior;

/**
 * @author Nelson Migliarini
 */
public class ConcreteDuck extends Duck {

	public ConcreteDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
}
