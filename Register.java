package com.student.org;

public class Register {
	/*public  void details(Student student1)
	{
	 System.out.println(student1);
	} */
	public static void main(String[] args) {
		Student student1= new Student();
		student1.setBranch("B-Tech");
		student1.setDepartment("information technology");
		student1.setFistName("gowsik");
		student1.setLastName("kannan");
		student1.setGender("male");
		//Register r1=new Register();
		//r1.details(student1);
		System.out.println(student1.toString());
	}

}
