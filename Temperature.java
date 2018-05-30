
public class Temperature {

	double deg;
	double celsius, fahrenheit;
	public void celsius(double deg) {
		deg= fahrenheit;
		celsius = 5.0 / 9.0 * ( fahrenheit - 32 ); 
		System.out.println("Celsius:" +celsius+"");
	}
	public void fahrenheit (double deg) {
		deg=celsius;
		fahrenheit = 9.0 / 5.0 * celsius + 32;
		System.out.println("Fahrenheit:" +fahrenheit+"");
		System.out.println();
		
		
	}
	public static void main(String args[]) {
		Temperature t1= new Temperature();
		Temperature t2= new Temperature();
		
		t1.celsius(45);
		t2.fahrenheit(90);
		
		
	}
}
