class Sample{
	final int v1 = 10;
	String str = "Java";

	public void test(){
		System.out.println("test() method of super class");
	}

	public void count(){
		System.out.println("count() method of super class");
	}
}

class Demo extends Sample{
	double z1 = 20;

	public void display(){
		System.out.println("display() method of subclass");
	}
}

class Main1{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();
		d.count();
		d.display();
		System.out.println(d.v1);
		System.out.println(d.str);
		System.out.println(d.z1);
	}
}