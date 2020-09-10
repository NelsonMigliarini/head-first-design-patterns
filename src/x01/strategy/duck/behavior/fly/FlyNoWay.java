package x01.strategy.duck.behavior.fly;

import x01.strategy.duck.behavior.FlyBehavior;

/**
 * @author Nelson Migliarini
 */
public class FlyNoWay implements FlyBehavior {
	
	static final String MESSAGE = "I can not fly";
	
	public String fly() {
		return MESSAGE;
	}
}
