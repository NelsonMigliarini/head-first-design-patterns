package x05.singleton;

/**
 * @author Nelson Migliarini
 */
public class EagerlySingleton {

	private static EagerlySingleton uniqueInstance = new EagerlySingleton();

	private EagerlySingleton() {}

	public static EagerlySingleton getInstance() {
		return uniqueInstance;
	}
}
