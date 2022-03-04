class WhatsAppV1{
	public void sendMsg(){
		System.out.println("send text msg");
	}

}

class WhatsAppV2 extends WhatsAppV1{
	public void voiceMsg(){
		System.out.println("send voice message");
	}

}

class WhatsAppV3 extends WhatsAppV2{
	public void videoCall(){
		System.out.println("start video calling");
	}

}
class WhatsAppV4 extends WhatsAppV3{
	public void uploadStatus(){
		System.out.println("uploading status");
	}
}
class Main2{
	public static void main(String[] args) {
		WhatsAppV4  w= new WhatsAppV4();
		w.sendMsg();
		w.voiceMsg();
		w.videoCall();
		w.uploadStatus();
		
	}
}