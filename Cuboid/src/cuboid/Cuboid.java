package cuboid;
import java.lang.*;
import java.util.*;
public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length,breadth,height;
		int totalArea,volume,perimeter;
		System.out.println("Enter the values of length,breadth and height");
	    Scanner scan = new Scanner(System.in);
	    length=scan.nextInt();
	    System.out.println("Length of cuboid is :"+length);
	    breadth=scan.nextInt();
	    System.out.println("Breadth of cuboid is :"+breadth);
	    height=scan.nextInt();
	    System.out.println("Height of cuboid is :"+height);
	    totalArea = (length*height)+(breadth*height)+(length*breadth);
	    System.out.println("Total Area of Cuboid is :"+totalArea);
	    volume = length*breadth*height;
	    System.out.println("Volume of cuboid is :"+volume);
	    perimeter = 2*(length+breadth);
	    System.out.println("Perimeter of cuboid is :"+perimeter);
	
	}

}
