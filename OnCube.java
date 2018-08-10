

import java.util.Scanner;

public class OnCube {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	//String input1="";
	//int arr[]=new int[N*3];
	
	
	String input=sc.next();
	
	String str[]=input.split(",");
	int a[]=new int[3];
	int b[]=new int[3];
	int c[]=new int[3];
	int dim1 = 0,dim2=0;
    for(int i=0;i<3;i++)
    {
    	a[i]=Integer.parseInt(str[i]);
    }
    int j=0;
    for(int i=3;i<6;i++)
    {
    	b[j]=Integer.parseInt(str[i]);
    	j++;
    }
    int k=0;
    for(int i=6;i<9;i++)
    {
    	c[k]=Integer.parseInt(str[i]);
    	k++;
    }
	for(int i=0;i<2;i++)
	{
		if(i==0) 
		{
			int d=b[i]-a[i];
			int e=b[i+1]-a[i+1];
			int f=b[i+2]-a[i+2];
			double out=Math.pow(d, 2)+Math.pow(e, 2)+Math.pow(f, 2);
			dim1=(int) Math.sqrt(out);
		}
		else if(i==1) 
		{
			int j1=0;
			int d=c[j1]-b[j1];
			int e=c[j1+1]-b[j1+1];
			int f=c[j1+2]-b[j1+2];
			double out=Math.pow(d, 2)+Math.pow(e, 2)+Math.pow(f, 2);
			dim2=(int) Math.sqrt(out);
		}
	}
	int out1=dim1+dim2;
	System.out.println(out1+1.05);
}
}
