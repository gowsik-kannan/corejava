package com.profile.my;

public class TestProfile {

public static void  printProfile(IProfile profile) 
{
	profile.myBasicInfo();
	profile.myHobbies();
	}
public static void main(String[] args) {
	IProfile myProfile =new ArunProfile();
	//IProfile myProfile =new GowsikProfile();
	printProfile(myProfile);
	
}
}
