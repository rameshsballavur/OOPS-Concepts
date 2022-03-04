class PrimitiveCasting{
	public static void main(String[] args) {
		
		int a = 10; //capacity 32
		double b = a; // capacity 64 //widening
		System.out.println(b);  // widening is done implicitly by compiler

		System.out.println("----------");

		double c = 32.9739; // 64
		int d = (int) c; // 32 //narrowing
		System.out.println(d); // narrowing is done explicitly by the programmer called -->// Primitive casting

		System.out.println("============================");


		char m = 'C';
		System.out.println("char : "+m);

		int n = m; // lower to higher =>widening -->done by compiler implicitly
		System.out.println("int: "+n);

		double d1 = m; //widening
		System.out.println(d1);

		System.out.println("-------------------------------------");

		double x = 67; //64 
		System.out.println("double : "+x);

		char y = (char) x; //16  // higher to lower =>narrowing --> done by programmer explicitly
		System.out.println("char : "+y);
	


	}                              

}