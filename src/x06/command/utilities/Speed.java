package x06.command.utilities;

/**
 * @author Nelson Migliarini
 */
public enum Speed {
	MIN("min"), MED("medium"), HIGH("high");
	
	public final String label;
	
	private Speed(String label) {
		this.label = label;
	}
}
