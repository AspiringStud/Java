package rectangle;

import java.util.*;

public class Rectangle {
    int length;
    int breadth;
    
    public int area()
    {
    	return length*breadth;
    }
    
    public int perimeter()
    {
    	return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
    	if(length == breadth)
    	{
    		return true;
    	}
    	else
    		
    	{
    		return false;
    	}
    }
    public class RectangleTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r=new Rectangle();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values for length and breadth of rectangle");
        r.length=s.nextInt();
        r.breadth=s.nextInt();
        System.out.println("Area :"+r.area());
        System.out.println("Perimeter :"+r.perimeter());
        System.out.println("Is length == breadth ? :"+r.isSquare());
       
        
        
	}

}
}
