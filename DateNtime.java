package com.java.prm;
import java.lang.*;
import java.util.*;

public class DateNtime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] arr=s.split(",");
		String[] darr=s.split(",");
		int date=31,mon=12,m=0,d=0;
		String month="";
		String date1="";
		String hour="";
		String minute="";
		int hour1=24,min1=60,h=0,min=0;
		while(mon>0 && m==0) {
			String s1=Integer.toString(mon);
			String s2="";
			if(s1.length()<2)
			{
				s2+=0;
				s2+=s1;
			}
			else {
				s2+=s1;
			}
			if(month.length()==0)
			{
			for(int k=0;k<arr.length;k++)
			{
			for(int j=0;j<arr.length;j++) {
				String s3="";
				s3+=arr[k];
				s3+=arr[j];
				if(k!=j && s3.length()==2)
				{
				if(s2.equals(s3))
				{
					month+=s2;
					arr[k]+=100;
					arr[j]+=100;
					m+=1;
					break;
				}
				}
			}
			}
			}
			mon-=1;	
	 }
	//	System.out.println("month"+month);	
		while(date>0 && d==0) {
			String s1=Integer.toString(date);
			String s2="";
			if(s1.length()<2)
			{
				s2+=0;
				s2+=s1;
			}
			else {
				s2+=s1;
			}
			if(date1.length()==0)
			{
			for(int k=0;k<arr.length;k++)
			{
			for(int j=0;j<arr.length;j++) {
				String s3="";
				s3+=arr[k];
				s3+=arr[j];
				if(k!=j && s3.length()==2)
				{
				if(s2.equals(s3))
				{
					date1+=s2;
					arr[k]+=100;
					arr[j]+=100;
					d+=1;
					break;
				}
				}
			}
			}
			}
			date-=1;	
	 }
		//System.out.println("date"+date1);
		while(hour1>0 && h==0) {
			String s1=Integer.toString(hour1);
			String s2="";
			if(s1.length()<2)
			{
				s2+=0;
				s2+=s1;
			}
			else {
				s2+=s1;
			}
			if(hour.length()==0)
			{
			for(int k=0;k<arr.length;k++)
			{
			for(int j=0;j<arr.length;j++) {
				String s3="";
				s3+=arr[k];
				s3+=arr[j];
				if(k!=j && s3.length()==2)
				{
				if(s2.equals(s3))
				{
					hour+=s2;
					arr[k]+=100;
					arr[j]+=100;
					h+=1;
					break;
				}
				}
			}
			}
			}
			hour1-=1;	
	 }
		//System.out.println("hour"+hour);
		while(min1>0 && min==0) {
			String s1=Integer.toString(min1);
			String s2="";
			if(s1.length()<2)
			{
				s2+=0;
				s2+=s1;
			}
			else {
				s2+=s1;
			}
			if(minute.length()==0)
			{
			for(int k=0;k<arr.length;k++)
			{
			for(int j=0;j<arr.length;j++) {
				String s3="";
				s3+=arr[k];
				s3+=arr[j];
				if(k!=j && s3.length()==2)
				{
				if(s2.equals(s3))
				{
					minute+=s2;
					arr[k]+=100;
					arr[j]+=100;
					min+=1;
					break;
				}
				}
			}
			}
			}
			min1-=1;	
	 }
		//System.out.println("minute"+minute);
		int n=1;
		String orginaldate="";
		orginaldate+=month+"/"+date1;
		String orginaltime="";
		orginaltime+=hour+":"+minute;
		for(int k=0;k<darr.length-1;k++) {
			//System.out.println(darr[k]);
			if(darr[k].equals(darr[k+1]))
				n+=1;
		}
	//	System.out.println(n);
		if(n==darr.length)
		{
			System.out.println("0");
		}
		else {
		System.out.println(orginaldate+" "+orginaltime);
		}
	}

}
