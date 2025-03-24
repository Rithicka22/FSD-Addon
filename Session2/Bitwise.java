package Session2;

public class Bitwise {
	public static void main(String[] args) {
		int a=5,b=3;
		/*
		 * AND
		 * 0101
		 * 0011
		 * OR
		 * O101
		 * 0011
		 * ----
		 * 0111-->7
		 * ----
		 * 
		 * XOR
		 * 0101
		 * 0011
		 * ----
		 * 0110-->6
		 * ----
		 * 
		 * NOT-->-(n+1)_ayshaasmitha_
		 * 0101-->5
		 * 0001-->1
		 * ----
		 * 0110
		 * 
		 * final answer-->-6
		 */

		System.out.println("Bitwise AND:"+( a & b));
		System.out.println("Bitwise OR:"+(a | b));
		System.out.println("Bitwise XOR:"+(a^b));
		System.out.println("bitwise NOT:"+(~b));
	}
}
