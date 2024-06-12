public class RBI {

	public float getRateOfInterest() {
		return 6.7f;
	}
}
public class SBI extends RBI {
	
	public float getRateOfInterest() {
		return 7.2f;
	}
}
public class HDFC extends RBI {
	public float getRateOfInterest() {
		return 7.5f;
	}
}
public class ICICI extends RBI {
	public float getRateOfInterest() {
		return 8.1f;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		RBI bank;
		bank = new SBI();
		System.out.println(bank);
		
		bank = new HDFC();
		System.out.println(bank);
		
		bank = new ICICI();
		System.out.println(bank);
	}
}
