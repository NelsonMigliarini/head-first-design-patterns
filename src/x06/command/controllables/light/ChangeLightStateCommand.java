package x06.command.controllables.light;

import x06.command.controllables.Command;

/**
 * @author Nelson Migliarini
 */
public class ChangeLightStateCommand implements Command {

	private Light light;

	public ChangeLightStateCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchState();
	}
	
	@Override
	public void undo() {
		light.switchState();
	}
}
