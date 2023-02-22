package typeCasting;

public class NarrowTypeCasting {

	public static void main(String[] args) {
	
		//In widening type casting it will automatically coverted the int variable to double and we don't have to explicitly tell the compiler. Since the box we are storing is big when compared to the content we are placing in
		
		//But in  the case of narrow type casting the box will be small and the content we are going to place will be huge. So we have to explicitly tell the compiler to cut some part of the content inoder to fit inside the box.
		
		double a = 34.33;
		//int b = a; --> This will throw the error
		int b = (int) a; //Here the size of a will be large as it is double and the size of b(The box) is small. so we have to mention it explicitly to convert from double to int and then store it inside the int variable. Here, there will be some loss of data.

		System.out.println("Narrow Type Casting: "+b);
		
	}

}
