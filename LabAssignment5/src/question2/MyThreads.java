package question2;

public class MyThreads {
	
	public static void main(String[] args) {
		SumOfRandom sum = new SumOfRandom(0);
		
		Thread thread1 = new Thread(sum);
		Thread thread2 = new Thread(sum);
		Thread thread3 = new Thread(sum);
		Thread thread4 = new Thread(sum);
		Thread thread5 = new Thread(sum);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		
		System.out.println("Total sum of random numbers generated is : " + sum.val);

	}

}
