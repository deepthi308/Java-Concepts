package TypeOfVariables;

public class Person{
	
	static int population = 0; //Static variable(Common to all instances)
	static String nationality = "Indian";//Static variable(Common to all instances)
	
	 String name; //Instance variables(Specific to that instance inside the class & outside the method)
	 int age; //Instance variables(Specific to that instance)
	 
	 public Person() {
		 population += 1;
	 }
	 
	public void setName(String name, int  age) {
		this.name = name;
		this.age = age;
	}
}

