
public class ArrayExample {

	int n;
	int r;
	int sum=0;
	int temp=0;

	public void storeNumber(int n) {
		int[] iarray = new int[10];
		int len= iarray.length;
		for (int i = 0; i < len; i++) {
		    int g = n % 10;
		   // System.out.println(g);
		    n /= 10;
		    iarray[i]=g;
		    System.out.print(iarray[i]+",");
		}
	}
		public static void main(String args[]) {
     
    	 ArrayExample ar = new ArrayExample();
    	 ar.storeNumber(1234);
    	 
     }
	     

}