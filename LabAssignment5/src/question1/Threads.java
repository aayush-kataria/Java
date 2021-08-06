package question1;

public class Threads {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());

		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("All threads terminated.");
		
	}

}
