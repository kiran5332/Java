import java.util.Scanner;
class TwoFive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :  ");
		int num = sc.nextInt();

		System.out.println((num%2==0 && num%5==0)?("Hi Two Five"):((num%5==0)?("Hi Five"):((num%2==0 )?("Hi Two"):(" "))));
	}
}
