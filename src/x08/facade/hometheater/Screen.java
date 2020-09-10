package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class Screen {

	private String name;

	public Screen(String name) {
		this.name = name;
	}

	public void down() {
		System.out.println(name + " going down");
	}

	public void up() {
		System.out.println(name + " going up");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
