class Sample 
{
	public Sample()
	{ 
		System.out.println("sample with zero");
	}
	public Sample(int a)
	{
		System.out.println("sample classs constructor");
	}
}
class Demo extends Sample
{
	public Demo()
	{
		
		System.out.println("Demo class Constructor");
	}
	public Demo(int a)
	{
		System.out.println("demo with parameters");
	}
}
class Main5 
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		new Sample();
		new Demo(12);
	}
}