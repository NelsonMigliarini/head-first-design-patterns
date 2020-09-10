package x01.strategy.duck.behavior.quack;

import x01.strategy.duck.behavior.QuackBehavior;

/**
 * @author Nelson Migliarini
 */
public class MuteQuack implements QuackBehavior {

	static final String MESSAGE = "I can not quack";

	public String quack() {
		return MESSAGE;
	}
}
