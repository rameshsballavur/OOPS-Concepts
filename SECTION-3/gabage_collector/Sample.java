package gabage_collector;

public class Sample
{	
	@Override
	public void finalize() 
	{
		System.out.println("object removed");
	}

	public static void main(String[] args)
	{
		Sample s1 = new Sample();
		s1= null;
		System.gc();
	}
}

