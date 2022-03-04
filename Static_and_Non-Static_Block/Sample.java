class Sample{

	
		static{
			System.out.println("static block 1");
		}
		public static void test(){
			System.out.println("test method");
		}
		static {
			System.out.println("static block 2");
		}
		public static void main(String[] args) {

			test();
			System.out.println("hello");
	}
}