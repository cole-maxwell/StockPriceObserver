package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;

public class DJIAQuoteObservable extends Observable
{
	private float quote;
	public DJIAQuoteObservable() {};
	public void changeQuote(float q) {
		this.quote = q;
		setChanged();
		notifyObservers(new Float(quote));
	}
}

