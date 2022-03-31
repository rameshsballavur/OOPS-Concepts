//1) object implementation layer
//2) object creation layer
//3) object utilization layer
//=-----------------------


interface User{  //1) object implementation layer

	public void transfer();
}

class Web implements User{
	@Override
	public void transfer(){
		System.out.println("transfer money through Web");
	}
}

class Atm implements User{
	@Override
	public void transfer(){
		System.out.println("transfer money through Atm");
	}
}

class Service{  //2) object creation layer

	public User objectCreation(int userid){  // uesrid=18238
		
		User u1;
		if(userid==1234){
			 u1= new Web();
			 return u1; //u1=web@123
		}
		else{
			u1=new Atm();
			return u1;
		}
	}
}

class Main{  //3) object utilization layer
	public static void main(String[] args) {
		Service s1 = new Service();
		User u1=s1.objectCreation(1234);
		u1.transfer();
	}
}
