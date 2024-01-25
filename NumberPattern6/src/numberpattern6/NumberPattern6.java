package numberpattern6;

public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int count=0;
		for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=i;j++)
			  {
				  count++;
				  System.out.print(count+" ");
			  }
			  System.out.println(" ");
		  }*/
		/*System.out.println("  ");
		for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=5-i+1;j++)
			  {
				 
				  System.out.print(j+" ");
			  }
			  System.out.println(" ");
		  }*/
		//System.out.println("  ");
		/*for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=5;j++)
			  {
				 if(i<=j)
				 
				   System.out.print(("* "));
				 
				 else
				 
					 System.out.print(" ");
				 
				 System.out.println("");
					 
			  }
			  
		  }*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>5)
					System.out.print(("* "));
					else
						System.out.print(" ");
					
			}
		}System.out.println("");
		
	}

}
