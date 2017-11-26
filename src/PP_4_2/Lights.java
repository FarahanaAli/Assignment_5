package PP_4_2;
public class Lights {

		public static void main(String[] args) {
		Bulb kitchen = new Bulb();
		Bulb livingroom = new Bulb();
		
		kitchen.bulbOn();
		livingroom.bulbOff();
		
		System.out.println("Lights in the kitchen? " + kitchen.getState() + " Lights" +
		" in the living room? " + livingroom.getState());
		;
		}

}
