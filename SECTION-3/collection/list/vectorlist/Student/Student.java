package collection.list.vectorlist.Student;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String email;
	private long  ph_no;
	public Student(int id, String name, String email, long ph_no) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.ph_no = ph_no;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", ph_no=" + ph_no + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(id == o.id)
			return 0;
		else if(id>o.id)
			return 1;
		return -1;
	}
	
}
