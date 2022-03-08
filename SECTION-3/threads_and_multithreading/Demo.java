package threads_and_multithreading;

public class Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		t1.start();
	}

}
