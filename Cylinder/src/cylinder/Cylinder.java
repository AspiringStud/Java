package cylinder;

import java.util.Scanner;

public class Cylinder {

	double radius;
	double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double totalSurfaceArea()
	{
		return circumference()*(height+radius);
	}
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
	
	public class CylinderTest{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cylinder c=new Cylinder();
      Scanner s =new Scanner(System.in);
      System.out.println("Enter radius and height of cylinder");
      c.radius=s.nextDouble();
      c.height=s.nextDouble();
      System.out.println("Lid Area :"+c.lidArea());
      System.out.println("Circumference :"+c.circumference());
      System.out.println("Total Surface Area :"+c.totalSurfaceArea());
      System.out.println("Volume :"+c.volume());
     
	}

	}
}

