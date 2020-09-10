package x02.observer.observable;

import x02.observer.observer.Observer;

/**
 * @author Nelson Migliarini
 */
public interface Observable {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
