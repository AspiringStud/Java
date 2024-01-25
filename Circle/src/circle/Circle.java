package circle;
import java.util.*;

public class Circle {
	double radius;
	public double area()
    {
   	  return Math.PI*radius*radius;
    }
	public double perimeter()
	{
		return 2*Math.PI*radius;
		
	}
	public double circumference()
	{
		return perimeter();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Circle c=new Circle();
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the radius of circle ");
     c.radius=s.nextInt();
     System.out.println("Area "+c.area());
     System.out.println("Perimeter "+c.perimeter());
     System.out.println("Circumference "+c.circumference());
	}

}
