
public class Perfect {
	int n;
	int sum=0;
	public void isPerfect(int n) {
		
    for(int i = 1; i < n; i++)

    {

        if(n % i == 0)

        {

            sum = sum + i;

        }

    }

    if(sum == n)

    {

        System.out.println("Given number is Perfect");

    }

    else

    {

        System.out.println("Given number is not Perfect");

    }    

}
public static void main() {
	Perfect p=new Perfect();
	p.isPerfect(6);
}
}
