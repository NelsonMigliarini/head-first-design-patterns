package x06.command.controllables.fan;

import x06.command.controllables.Command;

/**
 * @author Nelson Migliarini
 */
public class ChangeFanSpeedCommand implements Command {

	private Fan fan;

	public ChangeFanSpeedCommand(Fan light) {
		this.fan = light;
	}

	@Override
	public void execute() {
		fan.switchSpeedUp();
	}
	
	@Override
	public void undo() {
		fan.switchSpeedDown();
	}
}
