abstract class Sample{
	public abstract void test();
	public abstract void count();
	public abstract void display();
}

class Demo extends Sample{

	@Override
	public void test(){
		System.out.println("test");
	}

	@Override
	public void count(){
		System.out.println("count");
	}

	@Override
	public void display(){
		System.out.println("display");
	}
}

class Main2{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();
		d.count();
		d.display();
	}
}