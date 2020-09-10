package x06.command.utilities;

/**
 * @author Nelson Migliarini
 */
public enum State {
	ON("on"), OFF("off");
	
	public final String label;

	private State(String label) {
		this.label = label;
	}
}
