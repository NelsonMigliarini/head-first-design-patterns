package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class Amplifier {

	private String name;

	public Amplifier(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " on");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println(name + " setting DVD player to " + dvd.getName());
	}

	public void setSurroundSound() {
		System.out.println(name + " surround sound on (5 speakers, 1 subwoofer)");
	}

	public void setVolume(int value) {
		System.out.println(name + " setting volume to " + value);
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
