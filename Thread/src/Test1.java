
// Implements the Runnable interface
public class Test1 implements Runnable
{

	@Override
// override the run() method
	public void run() {
		System.out.println("thread task 1");
		
	}
	public static void main (String [] args) {
		// create object of (test) the class
		Test1 t= new Test1();
		// create object of thread class & pass the parameter in constructor.
		Thread th = new Thread(t);
		// start the thread.
		th.start();
	}
	
	

}
