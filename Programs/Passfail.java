import java.util.Scanner;
class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks =sc.nextInt();
		int per = (marks*100)/600;

		System.out.println((per>=75)?("Grade A with "+per +" % "):
							((per>=65)?("Grade b with "+per +" % "):
							((per>=35)?("Grade c with "+per +" % "):("Failed"))));
	}
}
