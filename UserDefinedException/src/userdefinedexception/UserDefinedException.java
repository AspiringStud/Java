package userdefinedexception;
 class NegativeDimensionException extends Exception
 {
	 public String toString()
	 {
	    return "Dimensions of a rectangle cannot be negative";
	 }
 }
public class UserDefinedException {
   static int area(int length,int breadth) throws NegativeDimensionException
   {
	   if(length<0 || breadth<0)
		   throw new NegativeDimensionException();
	   return length*breadth;
   }
   static void meth1() throws NegativeDimensionException
   {
	   System.out.println("Area is "+area(10,7));
   }
	public static void main(String[] args) {
      try
      {
    	  meth1();
      }
      catch(NegativeDimensionException e)
      {
    	  System.out.println(e);
      }
	}

}
