
public class ChildThread extends Thread
{
	private int n;
	private String msg;
	
	public ChildThread(int n,String msg) 
	{
		this.n= n;
		this.msg=msg;
	}
	public void run() 
	{
		for(int i =1;i<=n;i++) 
		{
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				System.err.println("Thread Interrupted: "+e.getMessage());
				Thread.currentThread().interrupt();
			}
			System.out.println(msg + i +" "+ Thread.currentThread().getName() );
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(4,"Hello");
		ChildThread t2 = new ChildThread(5,"Second Thread");
		t1.start();
		t2.start();
		t1.run();//explicitely calling
	}

}
