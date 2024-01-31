package thissuper;

class Rectangle{
	int length;
	int breadth;
	int x=10;
	
	Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void display()
	{
		System.out.println("Length :"+this.length);
		System.out.println("Breadth :"+this.breadth);
	}
}

 class Cuboid extends Rectangle{
	int height;
	int x=30;
	Cuboid (int l,int b,int h)
	{
		super(l,b);
		height=h;
	}
	void display()
	{
		System.out.println(super.x);
		System.out.println(x);
	}
}

public class ThisSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle r=new Rectangle(10,2);
     Rectangle r1=new Rectangle(10,10);
     Cuboid c=new Cuboid(12,12,12);
     r.display();
     r1.display();
     c.display();
	}

}
