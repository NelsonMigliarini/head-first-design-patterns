package x06.command.controllables.fan;

import x06.command.controllables.Command;

/**
 * @author Nelson Migliarini
 */
public class ChangeFanStateCommand implements Command {

	private Fan fan;

	public ChangeFanStateCommand(Fan light) {
		fan = light;
	}

	@Override
	public void execute() {
		fan.switchState();
	}
	
	@Override
	public void undo() {
		fan.switchState();
	}
}
