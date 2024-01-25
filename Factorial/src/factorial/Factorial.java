package factorial;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,factorial=1;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter number");
       n=scan.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   factorial=factorial*i;
    	   System.out.println("Factorial of number "+n+"! is "+factorial);
       }
	}

}
