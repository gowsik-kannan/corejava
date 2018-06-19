package logical;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one= sc.next();
		String two=sc.next();
		one=one.toLowerCase();
		two=two.toLowerCase();
		char[] first= one.toCharArray();
		char[] second=two.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		int count=0;
		for(int i=0;i<one.length()-1;i++) {
			
		
   if(first[i]==second[i]) {
	   count++;
	
}}
   if(count==one.length()-1) {
System.out.println(true);
   }
else {
	System.out.println(false);
}
	
	}
}
