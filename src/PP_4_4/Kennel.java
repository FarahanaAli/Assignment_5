package PP_4_4;
public class Kennel {

		public static void main(String[] args) {
			Dog dog0 = new Dog("Spot", 7);
			Dog dog1 = new Dog("Mark", 4);
			Dog dog2 = new Dog("Marly", 6);
			dog2.setAge(3);
			dog0.setName("Barley");
			System.out.println(dog2.getName() + " " + dog2.getAge());
			System.out.println(dog0.personYears());
			System.out.println(dog1.personYears());
			System.out.println(dog2.personYears());
			System.out.println(dog0.toString());
			System.out.println(dog1.toString());
			System.out.println(dog2.toString());

		}
}
