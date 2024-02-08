package runnableexample;

public class RunnableExample implements Runnable{
	
	
	
	public void run()
	{
		int i=1;
		while(true)
		{
		   System.out.println("This is java programming "+i);
		   i++;
		}
	}

	public static void main(String[] args) {
		
		RunnableExample r=new RunnableExample();
		Thread t=new Thread(r);
		t.start();
		
	    int	j=1;
	    while(true)
	    {
	    	System.out.println(j+" Language");
	    	j++;
	    }

	}

}
