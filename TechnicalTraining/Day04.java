//Case 1
package com.sairam.day2;

public class IfDemo {
	public static void main(String[] args) {
		int x=5;
		if(x!=5) 
			System.out.println("Value of x is not ¬5");
		System.out.println("Value of x is 5");
	}
}
//Case 2
public class IfElseDemo {
	public static void main(String[] args) {
		int age =11;
		if(age>=18)
			System.out.println("Eligible to Vote");
		else
			System.out.println("Not Eligible to Vote");
		System.out.println("If-Else Demonstration");
	}
}
//Case3
public class NestedIfElseDemo {
	public static void main(String[] args) {
		int a=10, b=20 , c=30;
		System.out.println("The Largest Number is:");
		if(a>b) {
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else {
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}
	}
}
//case 4
public class SwitchDemo {
	public static void main(String[] args) {
		char x='w';
		switch(x) {
		case 'l' :
		case 'L':
			System.out.println(x +" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x +" is a Digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x +" is White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x +" is a Symbol");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}
	}
}
//case 5
public class ForDemo {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
			System.out.println("The value of I is :"+i);
	}
}
//case 6
public class ForEcahDemo {
	public static void main(String[] args) {
		//using int
		int a[]= {10,20,30,40,50};
		for(int i:a)
			System.out.println(i);
		//using char
		char s[]= {'s','r','i','k','a','n','t','h'};
		for(char i:s)
			System.out.println(i);
	}
}


