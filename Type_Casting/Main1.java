class Sample{
	public void test(){
		System.out.println("hii");
	}
}

class Demo extends Sample{
	public void display(){
		System.out.println("hello");
	}
}

class Run extends Sample{
	public void count(){
		System.out.println("count");
	}
}

class Main1{

	public void view(Sample s)
	{
		System.out.println(" view of main class ");
	}

	public void view(Demo d){
		System.out.println("view method of sub-ref");
	}

	public static void main(String[] args) {
		Main1 m1 = new Main1();
		Sample s1 = new Sample();
		Demo d1 = new Demo();
		Run r1 = new Run();

		m1.view(d1);
		m1.view(r1);
		m1.view(s1);
	}
}