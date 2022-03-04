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

class Main{

	public void view(Sample s){
		System.out.println("view of main class");
	}
	public static void main(String[] args) {
		Main m = new Main();

		Demo d1 = new Demo();
		Run r1 = new Run();
		Sample s1 = new Sample();
		m.view(s1);
	}
}