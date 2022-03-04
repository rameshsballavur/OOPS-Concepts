// class object{

// }

class Sample{

	public Sample(){
		super();
		System.out.println("no argument first constructor ");

	}



}

class Demo extends Sample{


	public Demo(){  

		super();//--> super statement creates the object of super class  //new Sample()
		//super();
		System.out.println("Demo sub-class constructor");
	}

	public Demo(int a){
		super();
		System.out.println("Demo second constructor");
	}

	
}

class Main{
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(10);
		

	}
}