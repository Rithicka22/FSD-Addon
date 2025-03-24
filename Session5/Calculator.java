package Session5;

public class Calculator {
	
	//By changing the number of argument
	public int add(int a, int b) {
		return a+b;
		}
	
	public int add(int a, int b, int c) {
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(44, 90));
		
	}

}
