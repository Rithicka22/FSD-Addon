package Session5;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		//Converting Primitive to Wrapper Class
		int a = Integer.valueOf(50);
		
		Integer intObj = 50;
		
		Character charObj = 'A';
		
		Double dObj = 25.35478;
		
		System.out.println(a);
		System.out.println(intObj);
		System.out.println(charObj);
		System.out.println(dObj);
		
		System.out.println("------------------------------");
		
		//Converting Wrapper Class to primitive
		
		int value1 = intObj;
		char value2 = charObj;
		double value3 = dObj;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("-------------------------------------");
		
		//Using Utility method from Wrapper class
		int parseInt = Integer.parseInt("123");
		double parseDouble = Double.parseDouble("25.364782");
		boolean parseboolean = Boolean.parseBoolean("true");
		
		System.out.println(parseInt);
		System.out.println(parseDouble);
		System.out.println(parseboolean);
	}

}
