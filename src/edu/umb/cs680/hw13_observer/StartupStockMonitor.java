package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;

public class StartupStockMonitor
{
	public static void main(String[] args)
	{
		StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
		DJIAQuoteObservable djiaQuoteObservable = new DJIAQuoteObservable();

		PieChartObserver pieChartObserver = new PieChartObserver();
		TableObserver tableObserver = new TableObserver();
		ThreeDObserver threeDObserver = new ThreeDObserver();

		StockEvent stockEvent = new StockEvent("GOOG", 1734.56f);
		DJIAEvent djiaEvent = new DJIAEvent(649.86f);

		pieChartObserver.update(stockQuoteObservable, stockEvent);
		pieChartObserver.update(djiaQuoteObservable, djiaEvent);

		tableObserver.update(stockQuoteObservable, stockEvent);
		tableObserver.update(djiaQuoteObservable, djiaEvent);

		threeDObserver.update(stockQuoteObservable, stockEvent);
		threeDObserver.update(djiaQuoteObservable, djiaEvent);
	}
}





























