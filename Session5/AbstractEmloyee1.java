package Session5;

public class AbstractEmloyee1 extends AbstractEmloyee  {
	
	@Override
	public void futureDestination() {
		System.out.println("Full stack Developer");
	}
	
	public static void main(String[] args) {
		AbstractEmloyee1 ae = new AbstractEmloyee1();
		ae.name();
		ae.destination();
		ae.futureDestination();
		
	}
}
