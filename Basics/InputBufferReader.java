package user_input;
import java.io.*;

public class InputBufferReader {
	public static void main(String[] args) throws IOException {
		String s1,s2,s3,s4,s5,s6;int n ;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("What's your name");
		s1 = br.readLine();
		System.out.println("What's your age");
		s2 = br.readLine();
		System.out.println("Which your favourite item or dish or food");
		s3 = br.readLine();
		System.out.println("Which is Easiest programming language");
		s4 = br.readLine();
		System.out.println("What's your goal");
		s5 = br.readLine();
		System.out.println("What are your skills");
		s6 = br.readLine();
		
		System.out.println("Name : "+s1);
		System.out.println("Age : "+s2);
		System.out.println("Food : "+s3);
		System.out.println("Programming language : "+s4);
		System.out.println("Goal : "+s5);
		System.out.println("Skill : "+s6);

	}
}
/*Output : 
  What's your name
  Naruto
  What's your age
  22
  Which your favourite item or dish or food
  Ramen
  Which is Easiest programming language
  Think so Python
  What's your goal
  Hacker
  What are your skills
  Coding like java,python,c,c++ and Sports,Gaming  
Name : Naruto
Age : 22
Food : Ramen
Programming language : Think so Python
Goal : Hacker
Skill : Coding like java,python,c,c++ and Sports,Gaming  
 */
