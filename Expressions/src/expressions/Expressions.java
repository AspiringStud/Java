package expressions;

import java.lang.*;
import java.util.*;

public class Expressions {

	public static void main(String[] args) {
		int a,b,c;
		float s;
		double area;
		System.out.println("Enter a,b,c values ");
		Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("a value "+ a);
        b=scan.nextInt();
        System.out.println("b value "+ b);
        c=scan.nextInt();
        System.out.println("c value "+ c);
        
        s= (a+b+c)/2f;
        System.out.println("s is :"+ s);
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of triangle is: "+area);
	}

}
