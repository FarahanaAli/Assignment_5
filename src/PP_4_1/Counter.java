package PP_4_1;

public class Counter {
int count;
	public Counter() {
	count = 0;	
	}
	
	public void click() {
	count+=1;	
	}

	public int getCount() {
	return count;
	}

	public void reset() {
	count = 0;
	}
}

