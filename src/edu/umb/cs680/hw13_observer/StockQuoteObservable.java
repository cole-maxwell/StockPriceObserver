package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;
import java.util.TreeMap;

public class StockQuoteObservable extends Observable
{
	private TreeMap<String, Float> stockMap = new TreeMap<String, Float>();

	public StockQuoteObservable() {};

	public void changeQuote(String t, Float q) {
		stockMap.put(t, q);
		setChanged();
		notifyObservers(new StockEvent(t, q));
	}
}











