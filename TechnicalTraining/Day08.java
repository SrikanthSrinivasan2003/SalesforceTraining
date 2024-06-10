//Hirearchical Inheritance

public class person {
	
	private String Name;
	private String City;
	public person() {
		
	}
	public person(String name, String city) {
		this.Name = name;
		this.City = city;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "person [Name=" + Name + ", City=" + City + "]";
	}
	
}
public class employee extends person{
	
	private int empId;
	private float salary;
	private String dept;
	public employee() {
		
	}
	public employee(String name, String city,int empId,float salary,String dept) {
		super(name, city);
		this.dept = dept;
		this.empId = empId;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
}
public class student extends person {
	
	private String clas;
	private float per;
	public student() {
		
	}
	public student(String name, String city,String clas,float per) {
		super(name, city);
		this.clas=clas;
		this.per = per;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
}
public class hierarchicalInheritanceDemo {

	public static void main(String[] args) {
		//dynamic binding
		person p;
		p = new employee("Srikanth","Bangalore",91,12.5f,"ECE");
		System.out.println(p);
		p = new student("Luffy","Windmill Village,East Blue","6th sem",9.5f);
		System.out.println(p);
	}

}
