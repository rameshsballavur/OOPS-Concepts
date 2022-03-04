class Sample1{

	{
		System.out.println("non-static block 1");
	}

	public void test(){
		System.out.println("test method block");
	}
	{
		System.out.println("non-static block 2");
	}
	static
	{
		System.out.println("static block 3");
	}
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		s1.test();
	}
}