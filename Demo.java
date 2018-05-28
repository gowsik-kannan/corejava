import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Demo {
	public static void main(String s[]) {
		System.out.println("helloworld");
		byte a=10;
		byte b=20;
		int count=10;
		byte c= (byte)(a+b);//case
		System.out.println(c);
		count++;
		System.out.println(count);
		--count;
		System.out.println(count);
		float f=0.32f;
		int result=(int)( f + count);
		System.out.println(result);
		
		count = count + result;//operators
		System.out.println(count);
		count += result;
		System.out.println(count);
		boolean answer = true;
		System.out.println(!answer);
		String myname= "gowsik";
	 int contact= 18 ;
		System.out.println("hi,I am "+myname+".my age is "+contact+"");
		System.out.println(contact > 10);
		System.out.println(contact < 10);
		System.out.println(contact >= 10);
		System.out.println(a & b);
		System.out.println(a | b);
		if(contact%2==0)
			System.out.println("even");
		else
			System.out.print("odd");
	int response =	contact > 18 ? 20 : 15;
	
	int age=18;
	switch(age) {
	case 10:
		System.out.println("child");
		break;
	case 18:
		System.out.println("Adult");
		break;
	case 70:
		System.out.println("old");
		break;
	 default:
		 System.out.println("default");
		 break;
		
	}

	 
	}
}
