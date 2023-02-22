package concepts;

public class Overflow {

	public static void main(String[] args) {
		
		//Typecasting will be done based on the size of the variables
		//Overflow is when the range of the value is large and the variable cannot able to hold that huge variable
		
		int a = 130;
		byte b = (byte)a;
		
		System.out.println(b);

	}

}
