class Demo{

	public  Demo(){
		System.out.println("Zero arguments");
	}

	public Demo(int a){
		System.out.println("one with int argument");
	}

	public Demo(double b){
		System.out.println("one with double argument");
	}

	public Demo(int a, double b){
		System.out.println("two arguments");
	}

	public Demo(double b,int a){
		System.out.println("change in order of argument");
	}
	public static void main(String[] args) {
		new Demo();
		new Demo(10);
		new Demo(10.0);
		new Demo(10,10.0);
		new Demo(10.0,10);
	}
}