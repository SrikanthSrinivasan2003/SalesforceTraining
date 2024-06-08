package com.sairam.day1;
public class DivisionDemo {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double ans;
		ans = x / y;//answer is Infinity
		System.out.println(ans);
		
		x = -5.0;
		ans = x / y;//answer is -Infinity
		System.out.println(ans);
		
		x = 0.0;
		ans = x / y;//answer is NaN
		System.out.println(ans);
		
		int a = 5;
		int b = 0;
		int result = a / b;//Throws Arithmetic Exception: / by zero
		System.out.println(result);
		
	}
}
