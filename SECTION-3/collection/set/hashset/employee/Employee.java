package collection.set.hashset.employee;

public class Employee {
	 private int eid;
	 private String name;
	 private long ph_no;
	public Employee(int eid, String name, long ph_no) {
		super();
		this.eid = eid;
		this.name = name;
		this.ph_no = ph_no;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", ph_no=" + ph_no + "]";
	}
	 			
}
