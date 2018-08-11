package logic;

import java.util.Scanner;

public class PrimeIndex {
	public void check(int number) {
		
			 int count=0;
			for(int j=2;j<=number;j++) {
				
				if(number%j==0) 
					count++;
				}

			if(count==1) 
				System.out.println("prime");
			
		}
	

	 public static void main(String args[]){ 
	
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		PrimeIndex ob= new PrimeIndex();
		ob.check(n);
		
		}   
	 }
