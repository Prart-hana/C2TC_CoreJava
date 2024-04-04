package com.tns.daythree;

public class Access {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	void methodDefault()
	{
		System.out.println("Default access base class");
		System.out.println("Default Variable:"+varDefault);
	}
	public void methodPublic()
	{
		System.out.println("public access base class");
		System.out.println("public Variable:"+varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println("Private Variable:"+varPrivate);
	}
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected Variable:"+varProtected);
	}
	
}
