package Session4;

public class ConstructorOverLoading {

	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverLoading(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public ConstructorOverLoading(String empname, String location) {
		this(empname,0,location);
	}
	public ConstructorOverLoading(String empname, int empid) {
		this(empname,empid,null);
		
	}
		
	public void displayInfo() {
		System.out.println("Empname: "+this.empname);
		System.out.println("empid: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
		public static void main(String[] args) {
			ConstructorOverLoading cox = new ConstructorOverLoading("Rithii", 232240, "ooty");
			cox.displayInfo();
		}
		
	}

