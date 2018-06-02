
public class Inherits extends Stc {

	public  void Taxi() {
		
		System.out.println("taxi is empty");
		
	}
	public void policecar() {
		
		
	}
	public void SportsCar() {
		
	}
	//@Override
	public void brake() {
		System.out.println("break");
		
	}
	public static void main(String args[]) {
		Inherits i1 = new Inherits();
		i1.Taxi();
		i1.brake();
	}
}


