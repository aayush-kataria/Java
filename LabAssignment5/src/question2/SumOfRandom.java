package question2;

import java.util.Random;

public class SumOfRandom implements Runnable{
	
	int val;
	public SumOfRandom(int val) {
		this.val = val;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		int num = random.nextInt(10)+1;
		System.out.println(num + " is the random number generated by " + Thread.currentThread().getName());
		val = val+num;
	}

}
