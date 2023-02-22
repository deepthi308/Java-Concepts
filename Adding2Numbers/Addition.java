package Adding2Numbers;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();//User input
		
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();//User input
		
		int result = number1 + number2;
		
		System.out.println("The result is : "+ result);

	}

}
