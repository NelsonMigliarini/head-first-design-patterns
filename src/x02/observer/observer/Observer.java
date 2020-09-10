package x02.observer.observer;

import x02.observer.observable.Observable;

/**
 * @author Nelson Migliarini
 */
public interface Observer {

	public void update(Observable subject);
}
