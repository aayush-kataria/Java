package question1;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		try {
			for(int i=0; i<100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(100);
			}
		}catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrupted");
		}
	}
}
