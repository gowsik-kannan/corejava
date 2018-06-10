package videoDemos;

public class ArrayCopy {
	public static void main(String[] args) {
		
	

 int one[]= {12,32,43,3,2};
 int two[]=new int[one.length];
 for (int i=0;i< one.length;i++)
 {
	 two[i]=one[i];
 }
 System.arraycopy(one,0,two,0,one.length);
 for(int i=0;i<one.length;i++) {
	 
 
 System.out.println(two[i]);
}
	}
}