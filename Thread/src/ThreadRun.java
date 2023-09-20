
public class ThreadRun {

	public static void main(String[] args) {
		

		Thread t1 = new Thread(new thread1(1,2,3));
		Thread t2 = new Thread(new thread2(1,2,3));
		Thread t3 = new Thread(new thread3(1,2,3));
		t1.start();
		t2.start();
		t3.start();
		

	}

}
