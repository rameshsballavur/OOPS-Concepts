package collection.list.vectorlist.Student;
import java.util.Collections;
import java.util.Vector;
public class Main1 {
	static Vector<Student> vlist = new Vector<Student>();
	public void test() {
		Student s1 = new Student(3,"ramesh","ram@gmai.com",374917239);
		Student s2 = new Student(1,"ravi","ravi@gmai.com",97404849);
		Student s3 = new Student(5,"akash","akash@gmai.com",4985739);
		
		vlist.add(s1);
		vlist.add(s2);
		vlist.add(s3);
		System.out.println(vlist);
		vlist.remove(s1);
		System.out.println(vlist);
		vlist.add(s1);
		System.out.println(vlist);
		Collections.sort(vlist);
		System.out.println(vlist);
	}
	public static void main(String[] args) {
		Main1 m1 = new Main1();
		m1.test();
		System.out.println("-----------------------------------"+"\n");
		System.out.println("retrieving data using for each loop "+"\n");
		for(Object obj:vlist){
			System.out.println(obj);
		}
		System.out.println("------------------------------------"+"\n");
		System.out.println("retrieving data using for each method"+"\n");
		vlist.forEach(obj -> System.out.println(obj));
		
		
	}
}
