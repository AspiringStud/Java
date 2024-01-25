package fibonacciseries;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0,b=1,n,c;
      Scanner s=new Scanner(System.in);
      System.out.print("Enter number of terms");
      n=s.nextInt();
      
      System.out.print(a+","+b+",");
      for(int i=0;i<n-2;i++)
      {
    	  c=a+b;
    	  System.out.print(c+",");
    	  a=b;
    	  b=c;
    	 
      }
      
	}

}
