package x06.command.controllables;

/**
 * @author Nelson Migliarini
 */
public interface Command {

	public void execute();
	public void undo();
}
