class Sample{

	public   void test(){
		System.out.println("test");
	}

}
class Demo extends Sample{


	@Override
    public  void test(){
		System.out.println("test overriden");
		//super.test();
	}

}
class Main1{

public static void main(String[] args){
	Demo d1 = new Demo();
	d1.test();
}
}