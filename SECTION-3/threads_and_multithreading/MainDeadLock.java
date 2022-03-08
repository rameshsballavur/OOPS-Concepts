package threads_and_multithreading;

class Task1 implements Runnable{
	
	String s1 = null;
	String s2 = null;

	public Task1(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		
		System.out.println("t1 waiting to lock java");
		synchronized(s1) {
			System.out.println("t1 lock java");
			System.out.println("t1 waiting to lock sql");
			try {
				
				System.out.println("t1 pause the execution");
				s1.wait();
				System.out.println("t1 resume the execution");
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			synchronized(s2) {
				System.out.println("t1 lock sql");
			}
			System.out.println("t1 unlock java");
			System.out.println("t1 unlock sql");
		}
	}
}

class Task2 implements Runnable{
	String s1 = null;
	String s2 = null;
	
	public Task2(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		
		System.out.println("t2 waiting to lock sql");
		synchronized(s2) {
			System.out.println("t2 locked sql");
			System.out.println("t2 waiting to lock java");
			synchronized(s1) {
				System.out.println("t2 locked java");
				s1.notify();
			}
			System.out.println("t2 unlock sql");
			System.out.println("t2 unlock java");
		}	
	}
}
public class MainDeadLock {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "sql";
		
		Task1 t1 = new Task1(str1,str2);
		Task2 t2 = new Task2(str1,str2);
		
		Thread th1 =  new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();

	}

}
