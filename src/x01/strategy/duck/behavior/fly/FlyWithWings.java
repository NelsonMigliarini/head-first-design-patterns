package x01.strategy.duck.behavior.fly;

import x01.strategy.duck.behavior.FlyBehavior;

/**
 * @author Nelson Migliarini
 */
public class FlyWithWings implements FlyBehavior {

	static final String MESSAGE = "I can fly!!";
	
	public String fly() {
		return MESSAGE;
	}
}
