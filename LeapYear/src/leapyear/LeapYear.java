package leapyear;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
     int year;
     System.out.println("Enter the year");
     Scanner scan = new Scanner(System.in);
     year=scan.nextInt();
     if(year%4==0)
     {
    	 if(year%100==0)
    	 {
    		 if(year%400==0)
    		 {
    			 System.out.println("its a leap year");
    		 }
    		 else
    		 {
    			 System.out.println("Not a leap year");
    		 }
    	 }
     }
     else {
    	 System.out.println("Not a leap year");
     }
	}

}
