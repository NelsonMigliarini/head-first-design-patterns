package x08.facade.hometheater;

/**
 * @author Nelson Migliarini
 */
public class DvdPlayer {

	private String name;
	private String movie;

	public DvdPlayer(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " on");
	}

	public void play(String movie) {
		this.movie = movie;
		System.out.println(name + " playing \"" + movie + "\"");
	}

	public void stop() {
		System.out.println(name + " stopped \"" + movie + "\"");
	}

	public void eject() {
		System.out.println(name + " eject");
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

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
}
