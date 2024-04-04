package com.tns.daythree;

public class Methods {
	public static void main(String[] args) {
		 Access a1=new  Access ();
		 a1.methodDefault();
		 a1.methodProtected();
		 a1.methodPublic();
		 a1.varDefault=11;
		 a1.methodDefault();
		 a1.varProtected=31;
		 a1.methodProtected();
		 a1.varPublic=41;
		 a1.methodPublic();
		 System.out.println(a1 instanceof Access);
		 
		 
	}

}
