package TypeOfVariables;

public class Main {

	

	public static void main(String[] args) {
		
		String day = "Monday"; //Local Variable (Inside a method or function)
		
		Person person1 = new Person();//Instance of Person
		Person person2 = new Person();//Instance of Person
		Person person3 = new Person();//Instance of Person
		Person person4 = new Person();//Instance of Person
		Person person5 = new Person();//Instance of Person
		
		System.out.println(person1.population);
		System.out.println(person1.name);
		person1.setName("Deepthi", 21);
		System.out.println(person1.name);
		System.out.println(person1.age);
		
	}

}








	