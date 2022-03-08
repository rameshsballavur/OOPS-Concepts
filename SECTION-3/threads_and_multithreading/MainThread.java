package threads_and_multithreading;

class Task{
	int a = 0;
	
	synchronized public void increment() {
		a++;
	}
	
	synchronized public void decrement () {
		a--;
	}
	
	synchronized public void showvalue() {
		System.out.println(a);
	}
}

class ThreadTask1 implements Runnable{
	
	Task t1 =null;
	
	
	public ThreadTask1(Task t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void run() {
		t1.increment();
		t1.showvalue();
	}
	
}

class ThreadTask2 implements Runnable{
	
	Task t2 = null;
	
	public ThreadTask2(Task t2) {
		super();
		this.t2 = t2;
	}

	@Override
	public void run() {
		t2.decrement();
		t2.showvalue();
	}
}
public class MainThread {

	public static void main(String[] args) {
		Task t = new Task();
		ThreadTask1 tt1 = new ThreadTask1(t);
		ThreadTask2 tt2 = new ThreadTask2(t);
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		t1.start();
		t2.start();
		
	}

}
