
public class Employee {
	//public static void main (String s[]) {
		String first_name;
		String last_name;
		double salary;
		public Employee() {
			
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double increment() {
			salary=(salary/100)*10;
			return salary;
		}
		public static void main (String s[]) {
			Employee emp1 = new Employee();
			Employee emp2 = new Employee();
			
			emp1.salary=4000;
			emp2.salary=6000;
			
			System.out.println(emp1.salary);
			System.out.println(emp2.salary);
		}
	
	}
