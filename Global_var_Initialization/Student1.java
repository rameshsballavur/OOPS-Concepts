class Student1{
	String name;
	int id;
	static String cname;

	 public Student1(String name, int id , String cname){
	 	this.name=name;
	 	this.id=id;
	 	this.cname=cname;
	 }

	public void test(String name, int id,String cname){
		this.name=name;
		this.id=id;
		this.cname = cname;
	}

	 public static void main(String[] args) {
	 	Student1 s1 = new Student1("Ramesh",9832,"akash");
	 	// s1.name="ramesh";
	 	// s1.id = 534;
	 	//s1.test("ramesh",879,"akash");

	 	Student1 s2 = new Student1("ravadundi",92,"ksk");
	 	// s2.name = "ravi";
	 	// s2.id = 9839;
	 	//s2.test("ravi",23804);

	 	System.out.println(s1.name+" "+s1.id+" "+s1.cname);
	 	System.out.println(s2.name+" "+s2.id+" "+s1.cname);
		
	}
}