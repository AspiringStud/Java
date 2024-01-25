package displaydigits;
import java.util.*;

public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,r;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number");
      n=scan.nextInt();
      while(n>0)
      {
    	  r=n%10;
    	  n=n/10;
    	  System.out.println(r);
      }
	}

}
