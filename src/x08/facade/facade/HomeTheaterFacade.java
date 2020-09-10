package x08.facade.facade;

import x08.facade.hometheater.Amplifier;
import x08.facade.hometheater.DvdPlayer;
import x08.facade.hometheater.PopcornPopper;
import x08.facade.hometheater.Projector;
import x08.facade.hometheater.Screen;
import x08.facade.hometheater.TheaterLights;

/**
 * @author Nelson Migliarini
 */
public class HomeTheaterFacade {
	
	Amplifier amp;
	DvdPlayer dvd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper popper) {
		super();
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
