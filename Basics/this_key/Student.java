package this_key;

public class Student {
	int roll_number;
	String name;
	
	Student(int roll_number,String name)
	{
		this.roll_number = roll_number;
		this.name = name;
	}
	
	void Student_detail()
	{
		System.out.println(roll_number);
		System.out.println(name);
	}
	
	public static void main(String [] args)
	{
		Student std = new Student(22,"akash");
		std.Student_detail();
	}
}
