package com.sairam.day3;

public class Encapsulating {
	private int serialNum;
	private String name;
	private int age;
	//getter and setter
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulating obj = new Encapsulating();
		obj.setSerialNum(91);
		obj.setName("Srikanth");
		obj.setAge(21);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNum());
	}
}
