
public class Multiple {

	int num1;
	int num2;
	int num3;
	public void isMultiple(int num1,int num2)
	{
		if(num1%num2==0)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
	}
	public static void main (String agr[]) {
		Multiple m1=new Multiple();
		m1.isMultiple(6,2);
	}
}
