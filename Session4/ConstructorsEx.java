package Session4;

public class ConstructorsEx {
	public ConstructorsEx() {
		System.out.println("Default Constructors");
	}
		public ConstructorsEx(String name, String age) {
			System.out.println("Name: "+name);
			System.out.println("Parameterized Constructors");
		}
	
	public int sum(int a, int b) {
		int res = a + b;
		return res;
	}

	public static void main(String[] args) {
		ConstructorsEx ce = new ConstructorsEx("Rithicka Murugan", "19");
		System.out.println(ce.sum(5, 10));
		
	}
}
