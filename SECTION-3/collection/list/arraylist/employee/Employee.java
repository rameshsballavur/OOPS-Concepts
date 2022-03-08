package collection.list.arraylist.employee;



public class Employee implements Comparable<Employee>  {
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	private int eid;
	private String name;
	private long salary;
	public Employee(int eid, String name, long salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(eid==o.eid)
			return 0;
		else if(eid>o.eid)
			return 1;
		return -1;
	}
	
	

	
	
	
}
