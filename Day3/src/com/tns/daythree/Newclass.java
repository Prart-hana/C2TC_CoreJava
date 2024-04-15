package com.tns.daythree;
import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) {
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("enter person details: Name,Age,City");
		name=sc.nextLine();
		age=sc.nextInt();
		city=sc.nextLine();
		p.setPersonName(name);
		p.setPersonAge(age);
		p.setPersonCity(city);
		System.out.println("enter personal details:"+p.getPersonName()+ "\tAge:"+p.getPersonAge()+"\tCity:"+p.getPersonCity());
		System.out.println("enter personal details:Name,age and city");
		name=sc.nextLine();
		age=sc.nextInt();
		city=sc.nextLine();
		 p=new Person(name,age,city);
		 System.out.println("enter personname:"+p.getPersonName());
		
		
	}

}
