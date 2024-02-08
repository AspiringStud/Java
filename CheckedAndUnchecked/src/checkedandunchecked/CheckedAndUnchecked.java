package checkedandunchecked;

public class CheckedAndUnchecked {
    static void fun1()
    {
    	try {
    		int a=10/0;
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);//By default toString method is called here.
    	}
    }
    static void fun2()
    {
    	fun1();
    }
    static void fun3()
    {
    	fun2();
    }
	public static void main(String[] args) {
		fun3();

	}

}
