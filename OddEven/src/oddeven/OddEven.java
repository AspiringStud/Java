package oddeven;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
      int number;
      System.out.println("Enter the number");
      Scanner scan = new Scanner(System.in);
      number=scan.nextInt();
      if((number%2) == 0)
      {
    	  System.out.println("The given number is even");
      }
      else
      {
    	  System.out.println("The given number is odd");
      }
      
	}

}
