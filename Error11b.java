
public class Error11b {
	
	public static void main( String[] args )
	{
		int i = 1;float k;
		while ( i <= 10 ) {
		for (k= 0.1f; k < 1.0; k += 0.1 )
		System.out.println( k );
    break;
		}
		int n = 2;
		switch (n)
		{
		case 1:
		System.out.println( "The number is 1" );
		break;
		case 2:
		System.out.println( "The number is 2" );
		break;
		default:
		System.out.println( "The number is not 1 or 2" );
		break;
		}


		System.out.println("The following code should print the values 1 to 10:");
		n = 1;
		while (n< 10 ) {
		System.out.println( n++ );
		break;
	}
	}