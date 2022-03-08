package collection.set.hashset.employee;
import java.util.HashSet;
public class Main1 {
	static HashSet<Employee> hs = new HashSet<Employee>();
	public void test() {
		Employee e1 = new Employee(1,"a",987654321);
		Employee e2 = new Employee(2,"b",123456789);
		Employee e3 = new Employee(3,"c",1234532);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
//		hs.add(e1); Hash set do not store duplicate values
	}
	public static void main(String[] args) {
		Main1 m1 = new Main1();
		m1.test();
		
		System.out.println(hs);
		System.out.println("------------------"+"\n");
		System.out.println("retrieving the data using for each loop"+"\n");
		for(Object obj:hs) {
			System.out.println(obj);
		}
		System.out.println("---------------------"+"\n");
		System.out.println("retrieving the data using for each method"+"\n");
		hs.forEach(obj -> System.out.println(obj));
	}
}
