package x06.command;

import x06.command.control.concrete.RemoteControl;
import x06.command.controllables.fan.ChangeFanSpeedCommand;
import x06.command.controllables.fan.ChangeFanStateCommand;
import x06.command.controllables.fan.Fan;
import x06.command.controllables.light.ChangeLightStateCommand;
import x06.command.controllables.light.Light;

/**
 * @author Nelson Migliarini
 */
public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Fan livingFan = new Fan("Living Room");

		ChangeLightStateCommand livingLightState = new ChangeLightStateCommand(livingLight);
		ChangeLightStateCommand kitchenLightState = new ChangeLightStateCommand(kitchenLight);
		ChangeFanStateCommand livingFanState = new ChangeFanStateCommand(livingFan);
		ChangeFanSpeedCommand livingFantSpeed = new ChangeFanSpeedCommand(livingFan);

		remoteControl.setCommand(0, livingLightState);
		remoteControl.setCommand(1, kitchenLightState);
		remoteControl.setCommand(2, livingFanState);
		remoteControl.setCommand(3, livingFantSpeed);
		
		System.out.println(remoteControl);

		System.out.println("Executing");
		remoteControl.buttonWasPushed(0);
		remoteControl.buttonWasPushed(0);
		remoteControl.buttonWasPushed(1);
		remoteControl.buttonWasPushed(1);
		remoteControl.buttonWasPushed(2);
		remoteControl.buttonWasPushed(2);
		remoteControl.buttonWasPushed(3);
		remoteControl.buttonWasPushed(3);
		remoteControl.buttonWasPushed(3);
		remoteControl.buttonWasPushed(3);
		System.out.println("\nUndoing");
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
	}
}
