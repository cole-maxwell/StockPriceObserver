package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;
import java.awt.Graphics;

public class TableObserver implements Observer
{
	public TableObserver() {};

	public void update(Observable o, Object arg) {

		if (arg instanceof StockEvent) {
			StockEvent stockEvent = (StockEvent) arg;
			System.out.println("...drawing table for Stock Event...");
			System.out.println("Ticker: " + stockEvent.getTicker());
			System.out.println("New Quote: " + stockEvent.getQuote() + "\n");

		} else if (arg instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent) arg;
			System.out.println("...drawing table for DJIA Event...");
			System.out.println("New Quote: " + djiaEvent.getDJIA() + "\n");
		}
	}
}







