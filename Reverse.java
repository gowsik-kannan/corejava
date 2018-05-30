
public class Reverse {
	int num;
	
	
	public void reversed(int num) {
		int rnum=0;
		//int tnum=num;
		while(num != 0)
		{
		 rnum=rnum*10;
		rnum=rnum + num%10;
		num=num/10;
	
		}
		
		System.out.println(rnum);
}
public static void main(String args[]) {
	Reverse r1 = new Reverse();
	r1.reversed(1523);
}
}
