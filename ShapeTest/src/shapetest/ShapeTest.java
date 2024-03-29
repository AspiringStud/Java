package shapetest;

abstract class Shape{
	abstract public double perimeter();
	abstract public double area();
}
class Circle extends Shape{
	double radius;
	
	@Override
	public double perimeter() {
		
		return 2*Math.PI*radius;
		
	}
	@Override
	public double area()
	{
		return Math.PI*radius*radius; 
	}
	
}
class Rectangle extends Shape
{
	double length;
	double breadth;
	
	
	@Override
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	@Override
	public double area()
	{
		return length*breadth;
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.radius=10;
		Rectangle r=new Rectangle();
		r.length=12;
		r.breadth=13;
		
		System.out.println("Perimeter of circle :"+c.perimeter());
		
		System.out.println("Area of circle :"+c.area());
		
		System.out.println("Perimeter of rectangle :"+r.perimeter());
		System.out.println("Area of rectangle"+r.area());
		
	}

}
