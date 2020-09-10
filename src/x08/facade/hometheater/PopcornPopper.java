package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class PopcornPopper {

	private String name;

	public PopcornPopper(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " on");
	}

	public void pop() {
		System.out.println(name + " popping popcorn!");
	}

	public void off() {
		System.out.println(name + " off");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
