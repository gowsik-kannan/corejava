

public class Stc {

	static int count = 10;
	static{
		count++;
		System.out.println("First static block");
	}
	public Stc() {
		count++;
		System.out.println(count);
		
		
	}
	public static void getStc()
	{
		count++;
		System.out.println(count);
	}
	static {
		System.out.println("second Static block");
	}
	public static void main(String args[]) {
		Stc.count++;
		Stc.getStc();
		
	}
}

