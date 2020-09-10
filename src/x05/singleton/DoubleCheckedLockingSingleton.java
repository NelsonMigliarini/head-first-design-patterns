package x05.singleton;

/**
 * @author Nelson Migliarini
 */
public class DoubleCheckedLockingSingleton {

	private static volatile DoubleCheckedLockingSingleton uniqueInstance;

	private DoubleCheckedLockingSingleton() {}

	public static DoubleCheckedLockingSingleton getInstance() {
		if(uniqueInstance == null)
			synchronized(DoubleCheckedLockingSingleton.class) {
				if(uniqueInstance == null)
					uniqueInstance = new DoubleCheckedLockingSingleton();
			}
		return uniqueInstance;
	}
}
