
// we can access non-static-members present in different class inside a static-method
//                                           - or non-static-method by using only creating an object.


class Sample{
	int a = 50;
	static int b = 35;

	public void test(){
		System.out.println("this is test() of Sample class");
	}
} 

class Sample1{

	public static void display(){
		System.out.println(Sample.b);
	}

	public static void main(String[] args) {
		System.out.println(new Sample().a);
		new Sample().test();
		display();
	}
}

