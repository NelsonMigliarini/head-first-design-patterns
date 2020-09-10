package x07.adapter.duck;

/**
 * @author Nelson Migliarini
 */
public class MallardDuck implements Duck {

	@Override
	public void fly() {
		System.out.println("Quack");
	}

	@Override
	public void quack() {
		System.out.println("I'm flying");
	}
}
