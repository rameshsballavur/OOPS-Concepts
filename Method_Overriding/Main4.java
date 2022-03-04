class Android{
	public void homeScreen(){
		System.out.println("10 apps");
	}
}
class Samsung extends Android{
	@Override
	public void homeScreen(){
		System.out.println(" 5 apps");
	}
}
class OnePlus extends Android{
	@Override
	public void homeScreen(){
		System.out.println("2 apps");
	}
}
class RealMe extends Android{
	@Override
	public void homeScreen(){
		System.out.println("6 apps");
	}
}
class Main4{
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.homeScreen();
		OnePlus o1 = new OnePlus();
		o1.homeScreen();
		RealMe r1 = new RealMe();
		r1.homeScreen();
	}
}