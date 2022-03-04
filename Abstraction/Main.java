//1) object implementation layer
//2) object creation layer
//3) object utilization layer
//=-----------------------


interface User{  //1) object implementation layer

	public  void transfer();
}

class Web implements User{
	@Override
	public void transfer(){
		System.out.println("transfer method of Web");
	}
}

class Atm implements User{
	@Override
	public void transfer(){
		System.out.println("transfer method of Atm");
	}
}

class Service{  //2) object creation layer

	public User objectCreation(int userid){  // uesrid=18238
		
		User u1;
		if(userid==1234){
			 u1= new Web();
			 System.out.println("web object is created");
			 return u1; //u1=web@123
		}
		else{
			u1=new Atm();
			System.out.println("object of atm is created");
			return u1;
		}
	}
}

class Main{  //3) object utilization layer
	public static void main(String[] args) {
		Service s1 = new Service();
		User u2=s1.objectCreation(1234);
		u2.transfer();
	}
}