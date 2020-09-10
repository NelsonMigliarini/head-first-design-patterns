package x05.singleton;

/**
 * @author Nelson Migliarini
 */
public class PerformanceKillerSingleton {

	private static PerformanceKillerSingleton uniqueInstance;

	private PerformanceKillerSingleton() {}

	public static synchronized PerformanceKillerSingleton getInstance() {
		if(uniqueInstance == null)
			uniqueInstance = new PerformanceKillerSingleton();
		return uniqueInstance;
	}
}
