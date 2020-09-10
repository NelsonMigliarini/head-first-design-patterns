package x07.adapter.adapter;

import x07.adapter.duck.Duck;
import x07.adapter.turkey.Turkey;

/**
 * @author Nelson Migliarini
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for(int i = 0; i < 5; i++)
			turkey.fly();
	}
}
