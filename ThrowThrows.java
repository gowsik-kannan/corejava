package videoDemos;

import java.io.IOException;

public class ThrowThrows {
void m() {

	throw new ArithmeticException("throw exception");
}	
void n() throws IOException{
	System.out.println("Different between throw and throws");
}


public static void main(String[] args) {
	ThrowThrows obj= new ThrowThrows();
	obj.m();
}
}
