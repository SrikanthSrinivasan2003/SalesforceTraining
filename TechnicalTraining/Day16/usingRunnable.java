public class UsingRunnable implements Runnable
{
	Thread t;
	int h,l;
	String msg;
	
	public UsingRunnable(int l,int h,String msg) {
		this.msg=msg;
		this.h=h;
		this.l=l;
		t = new Thread(this, "ChildThread");
		t.start();
	}
	
	public void run() 
	{
		for(int i =l;i<=h;i++) {
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
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingRunnable ur = new UsingRunnable(10,20,"Hello");
		Runnable r  = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
