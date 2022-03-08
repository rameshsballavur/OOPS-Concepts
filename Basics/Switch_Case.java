import java.util.Scanner;

public class Switch_Case {
	
	public static void test() 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the input : " );
		int num = scan.nextInt();

		switch(num%2)
		{
			case 0 : System.out.println(num+" -->it is even");
		break;

		case 1: System.out.println(num +" -->it is odd");

		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
