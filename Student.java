
package com.student.org;

public class Student {

	private String FistName;
	private String LastName;
	private String Gender; 
	private String branch;
	private String Department;
	public String getFistName() {
		return FistName;
	}
	public void setFistName(String fistName) {
		FistName = fistName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
;		return "First name:" +FistName+ "Last name:" +LastName+ " gender: " +Gender+ "branch: "+branch+"";}
}