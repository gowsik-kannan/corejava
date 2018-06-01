import javax.swing.plaf.synth.SynthSeparatorUI;

public class SavingsAccount {
	static double annualInterestRate =4;
 double savingsBalance;
double interest;


public void calculateMonthlyInterest(double savingsBalance ) {
	//this.interest=interest;
	interest=(savingsBalance*(annualInterestRate/100))/12;
	savingsBalance +=interest ;
	System.out.println("new balance" +savingsBalance);
	
}
public static void modifyInterestRate(int newvalue) {
	
	annualInterestRate=newvalue;
	
}
public static void main(String args[]) {
	SavingsAccount server1=new SavingsAccount();
	SavingsAccount server2=new SavingsAccount();
	server1.calculateMonthlyInterest(2000.00);
     server2.calculateMonthlyInterest(3000.00);
     SavingsAccount.modifyInterestRate(5);
}
}
