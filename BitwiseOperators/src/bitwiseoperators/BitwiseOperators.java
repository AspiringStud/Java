package bitwiseoperators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int x=0b0010;
		int y=0b0011;
		int r= -0b1010;
		int a=2;
		int b=6;
		int z;
		int c;
		int l = x^y;
		int s = x<<2;
		int d = x>>2;
		int v= r>>>1;
		int f = r>>1;
		z= x|y;
		c=a&b;
		System.out.println("Bitwise AND operator :"+c);
	
		System.out.println("Bitwise OR operator :"+z);
		System.out.println("Bitwise XOR operator :"+l);
		System.out.println("Bitwise left shift operator :"+s);
		System.out.println("Bitwise right shift operator :"+d);
		System.out.println("Bitwise signed right shift operator :"+v);
		System.out.println("Bitwise right shift operator binary form :"+String.format("%s",Integer.toBinaryString(f) ));
	}

}
