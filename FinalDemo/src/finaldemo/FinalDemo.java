package finaldemo;
class Test{
	final int MAX=10;
	final static int MIN;
	final int NORMAL;
	static {
		MIN=2;
	}
	Test()
	{
		NORMAL=5;
	}
	public void display() {
		System.out.println("MIN :"+MIN+" ,MAX  :"+MAX+" ,NORMAL :"+NORMAL);
	}
}
public class FinalDemo {
  
	public static void main(String[] args) {
	Test t1=new Test();
	t1.display();
   
	}

}
