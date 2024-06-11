package com.sairam.day7;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//Declaring methods as Default,Public,Private,Protected
	void methodDefault() {
		System.out.println("Default Method");
		System.out.println("Default Variable: "+ varDefault);
	}
	
	public void methodPublic() {
		System.out.println("Public Method");
		System.out.println("Public Variable: "+ varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Private Method");
		System.out.println("Private Variable: "+ varPrivate);
	}
	
	void methodProtected() {
		System.out.println("Protected Method");
		System.out.println("Protected Variable: "+ varProtected);
	}
}
//same package as Base class
public class Executer {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.varDefault = 40;
		b1.varProtected = 50;
		b1.varPublic = 60;
		//b1.varPrivate = 10;//not accessible ,getter and setter need to be used
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();
	}
}


//Different package and accessing another package data's
package com.sairam.day7Second;

import com.sairam.day7.Base;

public class Executer {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.varDefault = 40;
		b1.varProtected = 50;
		b1.varPublic = 60;
		b1.varPrivate = 10;
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		b1.methodPrivate();

	}

}
