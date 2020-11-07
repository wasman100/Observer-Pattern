package observer;

import java.util.ArrayList;

public class Channel implements Subject {
	String status=null;
	String channelName=null;
	ArrayList<Observer> ALObserver = new ArrayList<Observer>();
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void notifyObservers() {  
		for(Observer watcher: ALObserver) {
			watcher.update(status);
		}
	}
	public void registerObserver(Observer watcher) {
		ALObserver.add(watcher);
	}
	public void removeObserver(Observer watcher) {
		ALObserver.remove(watcher);
	}
	  
	  
	  
}
