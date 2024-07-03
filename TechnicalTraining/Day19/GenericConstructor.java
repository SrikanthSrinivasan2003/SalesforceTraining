public class GenericConstrutor {
	private double v;
	public<T extends Number> GenericConstrutor(T t){
		v = t.doubleValue();
	}
	void show() {
		System.out.println("The Double value of the given number is: "+v);
	}
}
package com.sairam.day17;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		  System.out.println("Number to Double Conversion:");
		  
		  GenericConstrutor obj=new GenericConstrutor(10);
		  obj.show();
		  
		  GenericConstrutor objOne=new GenericConstrutor(136.8F);
		  objOne.show();
		  
			/*
			 * GenericConstructors objTwo=new GenericConstructors("Hello")); objTwo.show();
			 */

	}

}
