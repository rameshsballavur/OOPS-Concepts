class Super{
	int a = 432;

	 public void test(){
	 	System.out.println("test()");
	 }

	 public void display(){
	 	System.out.println("display");
	 	test();
	 }
	public static void main(String[] args) {

		System.out.println(new Super().a);
		new Super().display();
		//System.out.println();
		
	}
}