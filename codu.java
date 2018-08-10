import java.util.Scanner;
public class Codu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long sum = 0;
         long y=(long) Math.pow(10, 7);
         long z=(long) Math.pow(10, 18);
		int N = sc.nextInt();
		if(N>=1 && N<y) {
          
			for (int i = 0; i < N; i++) {

			final long x = sc.nextLong(); // read input
		if(x>=0&& x<=z) {
			String str = Long.toString((long) Math.pow(1 << 1, x));
	
			str = str.length() > 2 ? str.substring(str.length() - 2) : str;

			sum += Integer.parseInt(str);
}
		}

			System.out.println(sum%100);
		}
}
}
