
public class Even {
	int num1;
	
	public void isEven(int num1)
	{
		if(num1%2==0)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
	}
	public static void main (String agr[]) {
		Even m1=new Even();
		m1.isEven(6);
	}
}



