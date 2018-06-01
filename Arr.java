
public class Arr {

	public static void main(String[] args) {
		int squares[] =new int[4];
		for(int i=0;i<squares.length;i++) {
			i=i*2;
			System.out.println(i);
		}
		squares[3]=20;
		int data[]= {2,4,6,8,9,10};
		System.out.println("value in sixth position " +data[5]);
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		
	}
	
}

