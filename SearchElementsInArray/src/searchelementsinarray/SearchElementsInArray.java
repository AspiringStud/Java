package searchelementsinarray;
import java.util.*;

public class SearchElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int[] array= {3,9,7,8,6,4,5,2,1};
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the key value to search");
    int key=s.nextInt();
   
    for(int i=0;i<array.length;i++)
    {
    	if(array[i]==key)
    	{
    		System.out.println("Element found at index :"+i);
    		System.exit(0);
    	}
    }
    System.out.println("Not found");
	}

}
