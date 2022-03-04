class Sample{
	int a =10;
	public void count(){
		System.out.println("count");
	}

	public void test(){
		System.out.println("test");
	}
}
class Demo extends Sample{

	@Override
	public void count(){
		System.out.println("count overriden");
		super.count();
	}
	@Override
	public void test(){
		System.out.println("test overriden");
		super.test();
		System.out.println(super.a);

	}
}
class Main2_SuperKeyword{
	public static void main(String[] args) {

		Demo d1 = new Demo();
		d1.test();
		
		d1.count();
	}
}