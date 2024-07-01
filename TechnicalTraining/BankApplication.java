public class Account 
{
	private int accNO;
	private String name;
	private double balance;
	private Bank bank;
	public Account(int accNO, String name, double balance, Bank bank)
	{
		this.accNO= accNO;
		this.name=name;
		this.balance=balance;
		this.bank=bank;
	}
	public int getAccNO() 
	{
		return accNO;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public Bank getBank()
	{
		return bank;
		
	}
	public void deposit(double amount)
	{
		bank.deposit(this, amount);
	}
	public void withdraw(double amount)
	{
		bank.withdraw(this, amount);
	}
	public void setAccNo(int accNO)
	{
		this.accNO= accNO;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(double balance)
	{
		this.balance= balance;
	}
	public void setBank(Bank bank)
	{
		this.bank=bank;
	}
	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}	
}

public interface Bank {
	double MIN_BALANCE=1000;
	double DEPOSITE_LIMIT=25000;
	double INTEREST_RATE=7.8;
 void deposit(Account account ,double amount);
 void withdraw(Account account ,double amount);
}

public class InsufficientFundsException extends Exception {
	InsufficientFundsException(){
		super("Insufficient Funds Try Again...");
	}
	InsufficientFundsException(String message){
		super(message);
	}
}

public class InvalidAmountException extends Exception {
	InvalidAmountException(){
		super("Try to enter Valid Amount.... Try Again");
	}
	InvalidAmountException(String message){
		super(message);
	}
}

public class BankImplimentation  implements Bank
	{
	public void deposit(Account account,double amount)
	{
		try{
			if(amount>DEPOSITE_LIMIT)//5000>25000
				throw new InvalidAmountException("Deposite Limit Exceeded.... Try Again");
			else
			{
				account.setBalance(account.getBalance()+amount);
			    System.out.println(" Deposited into account: "+account.getAccNO() +" Rs."+amount);
			}
		}
		catch(InvalidAmountException e) {
			System.err.println(e.getMessage());
		}
	}
	public void withdraw(Account account, double amount)
	   {
	    try{
		   if(account.getBalance()-amount>=MIN_BALANCE)
		    { 
			   account.setBalance(account.getBalance()-amount);
			    System.out.println("Withdrawn "+amount+" from account: "+account.getAccNO());
		     }
		    else
		    	throw new InsufficientFundsException("Insufficient Funds Try Again...");
			}
	    catch(InsufficientFundsException e) {
		System.err.println(e.getMessage());
		}
	    }
	}
	
public class BankApplication {
	
public static void main(String[] args)
{
	BankImplimentation bank= new BankImplimentation();
	Account account =new Account(101,"Srikanth",10000.0,bank);
	account.deposit(15600);
	System.out.println(account);
	//account.withdraw(100000);
}
}
