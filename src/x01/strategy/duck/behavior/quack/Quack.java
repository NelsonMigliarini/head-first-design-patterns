package x01.strategy.duck.behavior.quack;

import x01.strategy.duck.behavior.QuackBehavior;

/**
 * @author Nelson Migliarini
 */
public class Quack implements QuackBehavior {

	static final String MESSAGE = "Quack! Quack!";

	public String quack() {
		return MESSAGE;
	}
}
