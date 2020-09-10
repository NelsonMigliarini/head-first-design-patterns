package x06.command.controllables.light;

import static x06.command.utilities.State.OFF;
import static x06.command.utilities.State.ON;

import x06.command.utilities.State;

/**
 * @author Nelson Migliarini
 */
public class Light {
	
	private String name;
	private State state;

	public Light(String name) {
		this.name = name;
		this.state = OFF;
	}
	
	public void on() {
		state = ON;
	}
	
	public void off() {
		state = OFF;
	}
	
	public void switchState() {
		if(state == ON) 
			off();
		else
			on();
		System.out.println(String.format("%s light is %s", name, state));
	}
	
	
	@Override
	public String toString() {
		return name + " is " + state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
