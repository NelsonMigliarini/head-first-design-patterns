package x03.decorator.beverage;

/**
 * @author Nelson Migliarini
 */
public abstract class Beverage {
	
	protected Size size = Size.TALL;
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();
}
