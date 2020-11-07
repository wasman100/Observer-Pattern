package observer;

public interface Subject {

	public void registerObserver(Observer watcher);
	public void removeObserver(Observer watcher);
	public void notifyObservers();


}