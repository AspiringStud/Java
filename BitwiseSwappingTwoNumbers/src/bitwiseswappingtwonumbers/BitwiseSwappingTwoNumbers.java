package bitwiseswappingtwonumbers;

public class BitwiseSwappingTwoNumbers {

	public static void main(String[] args) {
		int x=10,y=20;
	    byte a=9,b=12; 
	    byte c;
		x=x^y;
		y=y^x;
		x=x^y;
		
		
		c= (byte) (a<<4);
		c= (byte) (c|b);
		
		System.out.println("The value of x is after swapping: "+x);
		System.out.println("The value of y is after swapping: "+y);

		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
		System.out.println("The value of c is after bitwise masking: "+c);
		

	}

}
