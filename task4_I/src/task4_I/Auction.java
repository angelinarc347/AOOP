package task4_I;

public interface Auction {
	void addObserver(Bidder bidder);
	 void removeObserver(Bidder bidder);
	 void notifyObservers(String message);

}
