package com.sairam.day4;
//case1
public class CustomerDetails {
	
	private String customerName;
	private String customerCity;
	private int customerId;
	
	//default constructor
	/*public CustomerDetails()
	{
		System.out.println("I am a default constructor");
	}*/
	//parameterized constructor
	public CustomerDetails(String customerName, String customerCity, int customerId) {
		this.customerName = customerName;//customerName = Srikanth
		this.customerCity = customerCity;
		this.customerId = customerId;
	}
	
	//getter and setter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	//toString()
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using default constructor
		/*CustomerDetails obj = new CustomerDetails();
		obj.setCustomerName("Srikanth");
		obj.setCustomerCity("Thirupattur");
		obj.setCustomerId(91);*/
		//using parameterized constructor
		CustomerDetails obj = new CustomerDetails("Srikanth","Thirupattur",91);
		System.out.println(obj);
	}

}

//case2
public class person {
	private String name;
	private String gender;
	private int age;
	private int income;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", gender=" + gender + ", age=" + age + ", income=" + income + "]";
	}
}


import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = obj.next();
		System.out.println("Enter income");
		int income = obj.nextInt();
		System.out.println("Enter gender");
		String gender = obj.next();
		
		person p = new person();
		p.setName(name);
		p.setGender(gender);
		p.setIncome(income);
		
		System.out.println("Enter age");
		int age = obj.nextInt();
		p.setAge(age);
		System.out.println(p);
	}

}
