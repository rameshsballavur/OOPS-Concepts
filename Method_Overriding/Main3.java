class WhatsAppv1{

	public void deleveryReport(){
		System.out.println("single tick");
	}
}
class WhatsAppv2 extends WhatsAppv1{

	@Override
	public void deleveryReport(){
		System.out.println("double tick");
		super.deleveryReport();
	}
}
class WhatsAppv3 extends WhatsAppv2{

	 @Override
	 public void deleveryReport(){
	 	System.out.println("blue tick");
	 	super.deleveryReport();
	 }
}
class Main3{
	public static void main(String[] args) {
		WhatsAppv3 v3 = new WhatsAppv3();
		v3.deleveryReport();
	}
}