package PP_4_2;

public class Bulb {
boolean state;
	public Bulb() {
	state = false;	
	}
	public void bulbOff() {
	state = false;
	}
	public void bulbOn() {
	state = true;	
	}
	public boolean getState() {
	return state;
	}
}
