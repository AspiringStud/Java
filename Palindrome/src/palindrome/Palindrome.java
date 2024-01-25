package palindrome;
import java.util.*;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,rev=0,r,m;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the number");
	     n=s.nextInt();
	     m=n;
	     while(n>0)
	     {
	    	 r=n%10;
	    	 rev=rev*10+r;
	    	 n=n/10;
	    	 
	     }
	     if(rev==m)
	     {
	     System.out.println("palindrome number");
	     }
	     else
	     {
	    	 System.out.println("not a palindrome number");
	     }
	}

}
