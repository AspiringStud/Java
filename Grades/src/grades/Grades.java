package grades;
import java.util.*;

public class Grades {

	public static void main(String[] args) {
    int m1,m2,m3;
    int total;
    float average;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the marks");
    m1=scan.nextInt();
    m2=scan.nextInt();
    m3=scan.nextInt();
    total=m1+m2+m3;
    average=total/3;
    System.out.println("total and average is:"+total+" "+average);
    if(average>=70)
    {
    	System.out.println("Grade is A");
    	
    }
    else if(average>=60 && average <70)
    {
    	System.out.println("Grade is B");
    }
    else if(average>=50 && average<60)
    {
    	System.out.println("Grade is C");
    }
    else if(average >=40 && average <50)
    {
    	System.out.println("Grade is D");
    }
    else
    {
    	System.out.println("Grade is F");
    }
	}

}
