class Sample
{
	public void test()
	{
		System.out.println("hii");
	}
}
class Demo extends Sample
{
	public void display()
	{
		System.out.println("hello");
	}
}
class Run extends Sample
{
	public void count()
	{
		System.out.println("count");
	}
}
class ClassCastException
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();// d1 is subclass object ref
		Sample s1=d1;//s1 is upcasted ref(upcasting)
		s1.test();
		
	

		Run r1 = (Run)s1; //JVM throws classCastException
		// whenever we try to downcast an uscasted ref to different class refrence 
		// which do not contain the properties of given object then JVM throws classCastException
	}
}