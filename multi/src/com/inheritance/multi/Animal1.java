package com.inheritance.multi;

public class Animal1 implements IOwner{

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return null;
	}
	
class cat extends Animal1
{
	@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			return i+10;
		}
	
		@Override
		public String ownerName() {
			// TODO Auto-generated method stub
			return "Cat Owner";
		}
	}
class dog extends Animal1
{
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return i+10;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Dog Owner";
	}
}
class Tiger extends Animal1
{
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return i+30;
	}
	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Tiger Owner";
	}
}
}