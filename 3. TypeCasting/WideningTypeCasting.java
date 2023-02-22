package typeCasting;

public class WideningTypeCasting {

	public static void main(String[] args) {
		
		//There are two types of type casting 
		//Widening type casting 
		//Narrowing type casting
		
		int a = 10;
		double b = a; //Here integer which is smaller in size when compared to double is getting assigned to a double variable. So the integer value will be expanded to double
		
		System.out.println("Widening WideningTypeCasting : "+b);

	}

}
