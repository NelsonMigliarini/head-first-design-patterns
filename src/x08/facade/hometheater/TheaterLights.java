package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class TheaterLights {

	private String name;

	public TheaterLights(String name) {
		this.name = name;
	}

	public void dim(int value) {
		System.out.println(name + " dimming to " + value + "%");
	}

	public void on() {
		System.out.println(name + " on");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
