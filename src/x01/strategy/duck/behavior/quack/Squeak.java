package x01.strategy.duck.behavior.quack;

import x01.strategy.duck.behavior.QuackBehavior;

/**
 * @author Nelson Migliarini
 */
public class Squeak implements QuackBehavior {

	static final String MESSAGE = "Squeak!...";

	public String quack() {
		return MESSAGE;
	}
}
