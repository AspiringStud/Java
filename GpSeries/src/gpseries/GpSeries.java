package gpseries;

import java.util.Scanner;

public class GpSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,r,n;
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter initial term a");
	      a=s.nextInt();
	      System.out.println("Enter common ratio r");
	      r=s.nextInt();
	      System.out.println("Enter num of terms n");
	      n=s.nextInt();
	      
	      int term=a;
	      for(int i=0;i<n;i++)
	      {
	    	  System.out.print(term+",");
	    	  term=term*r;
	      }
	}

}
