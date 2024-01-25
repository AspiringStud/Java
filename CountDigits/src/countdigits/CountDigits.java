package countdigits;
import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,count=0;
     System.out.println("Enter the number");
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     while(n>0)
     {
    	 n=n/10;
    	 count++;
     }
     System.out.println(count);
	}

}
