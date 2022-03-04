interface Run {
	public void test();
}
interface Run1 extends Run{
	public void display();
}
class Sample implements Run1{
	@Override
	public void test(){
		System.out.println("test method overriden of Run interface");
	}
	@Override
	public void display(){
		System.out.println("display method overriden of Run1 interface");
	}
}
class Main2{
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.test();
		s1.display();
	}
}