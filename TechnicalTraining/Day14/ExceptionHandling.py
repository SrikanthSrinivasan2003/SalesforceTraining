#1. simple try catch
public class TryCatchExample {
	static void performDivision(int x,int y) {
		System.out.println("Im in Method");
		int z;
		try {
			z = x/y;
			System.out.println("Result of Z: "+z);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("Im in main method");
		TryCatchExample.performDivision(12,6);
		TryCatchExample.performDivision(12,0);
	}

}


#2.Multiple catch
import java.util.*;
import java.util.Scanner;
public class Division {
	public static void divide() {
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two input");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println("Division is :"+c);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input String");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Block");
			sc.close();
		}
		System.out.println("Statement After Finally Block");
	}
}
public class MultipleCatchDemo {

	public static void main(String[] args) {
		Division.divide();

	}

}
