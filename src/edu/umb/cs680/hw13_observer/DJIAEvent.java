package edu.umb.cs680.hw13_observer;
import java.util.Observer;
import java.util.Observable;

public class DJIAEvent
{
	private float djia;
	
	public DJIAEvent() {};

	public DJIAEvent(float f) {
		this.djia = f;
	}
	public float getDJIA() {
		return djia;
	}
}



