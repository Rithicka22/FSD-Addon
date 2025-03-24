package Session2;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur age: ");
		int age = sc.nextInt();
		
		System.out.println("enter ur weight");
		int weight =  sc.nextInt();
		
		if(age>20) {
			if(weight>50) 
			{
				System.out.println("age and weight are satisfied can donate blood");
			}
			else
			{
				System.out.println("Under age cannot donate blood");
			}
		}	
		else 
		{
				System.out.println("age is not satisfied to donate blood");
				
				
		}
	}
	}
	


