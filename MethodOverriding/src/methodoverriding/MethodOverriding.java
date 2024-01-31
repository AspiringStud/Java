package methodoverriding;

class Super{
	public void display()
	{
		System.out.println("Super class display");
	}
}

class Sub extends Super{
	@Override
	public void display()
	{
		System.out.println("Sub Class Display");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		Super s=new Sub(); //Dynamic Method dispatch
		
		Super sup=new Super();
		Sub s1 = new Sub();
		s.display();
		sup.display();
		s1.display();
		
       
	}

}
