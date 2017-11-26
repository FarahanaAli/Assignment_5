package PP_4_4;

public class Dog {
String name;
int age;
int personyears;
	public Dog(String namein, int agein) {
		name = namein;
		age = agein;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String nameset) {
		name = nameset;
	}
	public void setAge(int ageset) {
		age = ageset;
	}
	public int personYears() {
		personyears = age * 7;
		return personyears;
	}
	public String toString() {
		return "Name: " + name + " Age(Dog): " + age  + " Age(Person): " + personyears;
	}
}
