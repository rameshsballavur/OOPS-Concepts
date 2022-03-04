class User{

	public void  test(){
		System.out.println("Hiii... I am test() method");
	}

	public void display(){
		System.out.println("Hiii... I am  display() method");
		test();
	}
}

class NullPointerException{
	public static void main(String[] args) {
		User ref1  ;  //output:NullPointerException.java:16: error: variable ref1 might not have been initialized
		

		ref1=new User();

		ref1.test();
		ref1.test();
		ref1.display();
	}
}


