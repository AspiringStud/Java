package multiplication;
import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}

	}

}
