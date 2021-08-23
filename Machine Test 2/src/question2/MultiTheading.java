package question2;

import java.util.Random;

class GenerateSum implements Runnable {
	public int sum;

	public GenerateSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		this.addRandomVal();
	}

	public void addRandomVal() {
		Random random = new Random();
		int value = random.nextInt(10) + 1;      //to generate random number between 1 to 10
		System.out.println("Number generated " + value + " by " + Thread.currentThread().getName());
		sum += value;
	}
}

public class MultiTheading {
	
	public static void main(String[] args) {
		GenerateSum Sum = new GenerateSum(0);
		Thread thread1 = new Thread(Sum);
		Thread thread2 = new Thread(Sum);
		Thread thread3 = new Thread(Sum);
		Thread thread4 = new Thread(Sum);
		Thread thread5 = new Thread(Sum);
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
		} catch (InterruptedException e) {
			System.out.println("Interruption Occured");
			e.printStackTrace();
		}
		//Total sum
		System.out.println("Total Sum: " + Sum.sum);
	}

}
