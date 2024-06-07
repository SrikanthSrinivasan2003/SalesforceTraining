//citizen
public class citizen {
	
	private String name;
	private long phoneNo;
	private String aadhar;
	private String address;
	public citizen() {
		
	}
	
	public citizen(String name, long phoneNo, String aadhar, String address) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.aadhar = aadhar;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "citizen [name=" + name + ", phoneNo=" + phoneNo + ", aadhar=" + aadhar + ", address=" + address
				+ ", getName()=" + getName() + ", getPhoneNo()=" + getPhoneNo() + ", getAadhar()=" + getAadhar()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}



//student
public class student extends citizen{
	

	private int rollNo;
	private String collegeName;
	
	public student(){
		
	}
	public student(String name, long phoneNo, String aadhar, String address ,int rollNo,String collegeName) {
		super(name, phoneNo, aadhar, address);
		this.rollNo=rollNo;
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getAadhar()=" + getAadhar() + ", getAddress()=" + getAddress()
				+ "]";
	}
	
}
//main
public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		student obj = new student("Srikanth",1234589L,"123456789009","Thirupattur",91,"Sairam");
		System.out.println(obj);
	}

}
