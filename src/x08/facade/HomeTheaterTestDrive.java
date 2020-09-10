package x08.facade;

import x08.facade.facade.HomeTheaterFacade;
import x08.facade.hometheater.Amplifier;
import x08.facade.hometheater.DvdPlayer;
import x08.facade.hometheater.PopcornPopper;
import x08.facade.hometheater.Projector;
import x08.facade.hometheater.Screen;
import x08.facade.hometheater.TheaterLights;

/**
 * @author Nelson Migliarini
 */
public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
		Projector projector = new Projector("Top-O-Line Projector");
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
