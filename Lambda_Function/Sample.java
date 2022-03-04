interface Sample{

	public void test(int a);

	public static void main(String[] args){
		Sample s1 = (int n1)->
		{
			System.out.println("providing function 1 :"+n1);
		};
		s1.test(10);

		Sample s2 = (int n2)->
		{
			System.out.println("providing function 2 :"+n2);
		};
		s2.test(20);

		Sample s3 = (int n3)->
		{
			System.out.println("providing function 3 :"+n3);
		};
		s3.test(30);
	}
}