package x01.strategy.duck;

import x01.strategy.duck.behavior.FlyBehavior;
import x01.strategy.duck.behavior.QuackBehavior;

/**
 * @author Nelson Migliarini
 */
public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public String performFly() {
		return flyBehavior.fly();
	}
	public String performQuack() {
		return quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
