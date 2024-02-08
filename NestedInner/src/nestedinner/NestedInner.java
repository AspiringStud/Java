package nestedinner;
class Outer{
 static int x=10;
  Inner inner=new Inner();
	class Inner{
		int y=20;
		public void innerDisplay()
		{
			System.out.println("Inside inner class display method");
			System.out.println("X :"+x+" Y :"+y);
		}
	}
	public void outerDisplay() {
		//Inner inner=new Inner();
		inner.innerDisplay();
		System.out.println("Inside Outer class display method "+inner.y);
	}
	

}

public class NestedInner {

	public static void main(String[] args) {
		//Outer o=new Outer();
		//o.outerDisplay();
		Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();

	}

}
