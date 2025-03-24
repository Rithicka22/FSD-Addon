package Session4;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "Java Program";
		//1.length
		System.out.println(s1.length());
		
		//2.eqauls()
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter username: ");
	String username = sc.next();
	
	System.out.println("Enter password: ");
	String password = sc.next();
	
	if(username.equalsIgnoreCase("Rithii") && password.equalsIgnoreCase("Sulochana")) {
		System.out.println("Succes");
	}
	else {
		System.out.println("Error 404 found");
	}
	/*	String s2 = "Rithicka";
		String s3 = "rithicka";
		
		System.out.println(s2.equals(s3));
		*/
		//==
/*		String s4 ="Rithii";
		String s5 ="sulochana";
		System.out.println(s4==s5);*/
	    String name = new String("Rithi");
	    String name1 = new String("Rithi");
	    System.out.println(name==name1);
		//compareTo
		//s1>s2-->Positive number
		//s1<s2-->Negative number
		//s1==s2-->0
		
		String s6 = "heuits";
		String s7 = "hellos";
		
		System.out.println(s6.compareTo(s7));
		
		//concat()
/*		String str1 = "Static";
		String str2 = new String("Program");
		System.out.println(str1.concat(str2));
		*/
		
		//toCharArray()
		String str3 = "Welcome to Java";
		System.out.println("Value of method: ");
		char[] ch = str3.toCharArray();
		for(char st: ch) {
			System.out.println(st);
		}
		
		//System.out.println(str3.toCharArray());
		
		//substring
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(0, 9));
		
		//intern
		String clg = "Kgisl";
		String clg1 = new String("Kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);
	}

}
