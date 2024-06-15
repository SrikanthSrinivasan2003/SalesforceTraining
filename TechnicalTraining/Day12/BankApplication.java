public interface Bank {
	double MIN_BALANCE=1000;
	double DEPOSITE_LIMIT=25000;
	double INTEREST_RATE=7.8;
 void deposit(Account account ,double amount);
 void withdraw(Account account ,double amount);
}

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

public class BankImpl implements Bank
{
public void deposit(Account account,double amount)
{
	if(amount>DEPOSITE_LIMIT)//5000>25000
		System.err.println("Deposit not possible..exceeds Deposit Limit");
	else
	{
		account.setBalance(account.getBalance()+amount);
	    System.out.println("Deposited into account:"+account.getAccNO());
	}
}
     public void withdraw(Account account, double amount)
   {
	   if(account.getBalance()-amount>=MIN_BALANCE)
	    { 
		   account.setBalance(account.getBalance()-amount);
		    System.out.println("Withdrawn"+amount+"from account:"+account.getAccNO());
	     }
	    else
		System.out.println("Insufficient balance in account:"+account.getAccNO());
}
	
}

public class BankApplication {
	
public static void main(String[] args)
{
	BankImpl bank= new BankImpl();
	Account account =new Account(101,"sathya",10000.0,bank);
	account.deposit(1000);
	System.out.println(account);
	account.withdraw(1000);
	System.out.println(1000);
}
}
