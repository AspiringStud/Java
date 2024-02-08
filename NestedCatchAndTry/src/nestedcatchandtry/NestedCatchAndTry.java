package nestedcatchandtry;

public class NestedCatchAndTry {

	public static void main(String[] args) {
		int A[]= {10,20,30,45,0};
		try {
			int b=A[0]/A[3];
			System.out.println("Division is "+b);
			try {
				System.out.println(A[5]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid index");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator cannot be zero,try again");
		}
       System.out.println("Bye");
	}

}
