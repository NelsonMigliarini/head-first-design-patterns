package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class Projector {

	private String name;

	public Projector(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " on");
	}

	public void wideScreenMode() {
		System.out.println(name + " in widescreen mode (16x9 aspect ratio)");
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
