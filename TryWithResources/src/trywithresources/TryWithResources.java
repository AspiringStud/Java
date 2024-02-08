package trywithresources;
import java.io.*;
import java.util.*;
public class TryWithResources {
   
static void divide() throws Exception
   {
	   try(FileInputStream f=new FileInputStream("C://MyJava/Test.txt");Scanner s=new Scanner(f))
	   {
	   int a=s.nextInt();
	   int b=s.nextInt();
	   int c=s.nextInt();
	   int d=s.nextInt();
	   int e=s.nextInt();
	   System.out.println("Output of division is : "+a/c);
	   }
	   
   }
	public static void main(String[] args) throws Exception{
     try
     {
		divide();
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
	}

}
