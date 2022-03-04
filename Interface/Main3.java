class Demo{
	public void display(){
		System.out.println("display method of Demo Super class");
	}
}

interface Run{
	public void count();
}

interface Run1{
	public void test();
}

class Sample extends Demo implements Run,Run1{
	@Override 
	public void count(){
		System.out.println("count method of Run interface");
	}

	@Override
	public void test(){
		System.out.println("test method of Run1 interface");
	}
}

class Main3{
	public static void main(String[] args) {
		Sample s1 =new Sample();
		s1.display();
		s1.count();
		s1.test(); 
	}  
}

