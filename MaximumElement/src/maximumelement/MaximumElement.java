package maximumelement;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,5,7,8,45,1,13,16};
		int max=array[0];
		int smax=array[0];
/* for(int i=0;i<array.length;i++)
  {
	  if(max<array[i])
	  {
		  max=array[i];
		  
	  }
  }
  System.out.println("Max element in array is :"+max);*/
  
  for(int i=0;i<array.length;i++)
  {
	  if(max<array[i])
	  {
		  max=array[i];
		  
	  }
	  else if(array[i]>smax)
	  {
		  smax=array[i];
	  }
  }
  System.out.println("Second largest element in array is :"+smax+" "+max);
	}

}
