package com.profile.my;

public class ArunProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		
		System.out.println(ProfileConstants.FIRST_NAME+"Arun");
		System.out.println(ProfileConstants.LAST_NAME+"Kumar");
		System.out.println(ProfileConstants.AGE);
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Boxer.");

		
	}
	

}
