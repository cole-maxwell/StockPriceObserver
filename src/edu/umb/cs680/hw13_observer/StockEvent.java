package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;

public class StockEvent 
{
	private String ticker;
	private float quote;

	public StockEvent(String t, Float q) {
		this.ticker = t;
		this.quote = q;
	}
	public String getTicker() {
		return ticker;
	}
	public float getQuote() {
		return quote;
	}
}




