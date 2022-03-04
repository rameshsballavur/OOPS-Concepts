interface RedTicket{
	public int redTicket(int a, int b, int c);

	public static void main(String[] args) {
	RedTicket r1 =(int a, int b, int c)->
	{
		if(a==2 && b==2 && c==2){
		    return 10;
		  }
		  else if(a==b&& b==c){
		    return 5;
		  }
		  else if(a!=b && a!=c){
		    return 1;
		  }
		  return 0;

	};
	System.out.println(r1.redTicket(2, 2, 2));
	System.out.println(r1.redTicket(2, 2, 1));
	System.out.println(r1.redTicket(0, 0, 0));
	}
}