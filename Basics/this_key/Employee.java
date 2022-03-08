package this_key;

public class Employee {

		int id;
		String name;
		
		Employee()
		{
			System.out.println("I am a default constructor");
		    id = 0;
			name = null;
		}
		Employee(int id)
		{
			System.out.println("I am a single parameterized constructor");
			this.id = id;
		}
		Employee(int id,String name)
		{
			System.out.println("I am a parameterized constructor");
			this.id = id;
			this.name = name;
		}
		
		void Employeedetails() {
			System.out.println(id);
			System.out.println(name);
		}

		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.Employeedetails();
			Employee emp2 = new Employee(34);
			emp2.Employeedetails();
			Employee emp3 = new Employee(56,"sharanu");
			emp3.Employeedetails();
			

		}

	}
	


