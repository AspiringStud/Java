package dynamicdispatch;

class Super
{
	public void meth1()
	{
		System.out.println("Super Meth1");
	}
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}
class Sub extends Super{
	@Override
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
	public void meth3()
	{
		System.out.println("Sub Meth3");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		Sub s=new Sub();
		Super sup =new Sub(); //Dynamic method dispatch
		
		s.meth1();
		s.meth2();
		s.meth3();
		
		System.out.println("Dynamic Method dispatch example");
		sup.meth1();
		sup.meth2();

	}

}
