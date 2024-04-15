package com.tns.daythree;

public class Person {
	private String personName;
	private int personAge;
	private  String personCity;
	public String getPersonName(){
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName=personName;
	}
	public int getPersonAge(){
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge=personAge;
	}
	public String getPersonCity(){
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity=personCity;
	}
	public String toString() {
		return "name of the person:"+personName +" "+" age of the person:"+personAge+" "+"City of living"+" "+personCity;
		
	}
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p);
		
		

		
	}
	

}
