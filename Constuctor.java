
public class Constuctor {
	int a;
	String m;
	public Constuctor()
	{
		//this(String m);
		System.out.print("no argument");
	}
	public Constuctor(String m) {
		//this(int a);
		System.out.println("name"+m+"");
		
	}
	public  Constuctor(int a) {
		System.out.println("age "+a+"");
		
	}
	public  Constuctor(String m,int a) {
		this();
		System.out.println("my name is "+m+" and age is "+a+"");
	
	}
public static void main(String args[]) {
	Constuctor s1=new Constuctor();
	s1.Constuctor("gowsik",18);
}
}
