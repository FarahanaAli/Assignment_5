package PP_4_1;
public class CounterTest {

	public static void main(String[] args) {
		Counter counter0 = new Counter();
		Counter counter1 = new Counter();
		
		counter0.click();
		counter1.click();
		counter1.click();
		System.out.println("Counter0 - Expected: 1 Actual: " + counter0.getCount() + "|" +
				"Counter1 - Expected 2 Actual: " + counter1.getCount());
		counter0.reset();
		counter1.reset();
		System.out.println("Counter0 - Expected: 0 Actual: " + counter0.getCount() + "|" +
				"Counter1 - Expected 0 Actual: " + counter1.getCount());
	}

}
