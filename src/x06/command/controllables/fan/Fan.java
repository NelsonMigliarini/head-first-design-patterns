package x06.command.controllables.fan;

import static x06.command.utilities.Speed.HIGH;
import static x06.command.utilities.Speed.MED;
import static x06.command.utilities.Speed.MIN;
import static x06.command.utilities.State.OFF;
import static x06.command.utilities.State.ON;

import x06.command.utilities.Speed;
import x06.command.utilities.State;

/**
 * @author Nelson Migliarini
 */
public class Fan {

	private String name;
	private State state;
	private Speed speed;

	public Fan(String name) {
		this.name = name;
		this.state = OFF;
		this.speed = MIN;
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
		System.out.println(String.format("%s fan is %s", name, state));
	}
	
	public void switchSpeedUp() {
		if(speed == Speed.MIN)
			speed = MED;
		else if(speed == Speed.MED)
			speed = HIGH;
		else if(speed == Speed.HIGH)
			speed = MIN;
		System.out.println(String.format("%s fan speed is %s", name, speed));
	}
	
	public void switchSpeedDown() {
		if(speed == Speed.HIGH)
			speed = MED;
		else if(speed == Speed.MED)
			speed = MIN;
		else if(speed == Speed.MIN)
			speed = HIGH;
		System.out.println(String.format("%s fan speed is %s", name, speed));
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

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
}
