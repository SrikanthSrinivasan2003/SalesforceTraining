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

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First"); // creating child thread object
		ChildThread t2 = new ChildThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

		t1.start();
		t2.start();
		Thread.currentThread().setName("Parent Thread"); // assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
		try {
			t1.join(); // wait current thread until t1 is dead
			t2.join(300); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore interrupted status
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}
}
