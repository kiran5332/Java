import java.util.Scanner;
class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :  ");
		int num = sc.nextInt();

		int temp=num;
		int rev=0;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			rev=rev*10+rem;
		}

		if(rev==temp)
			System.out.println(temp +" is a palindrome");
		else
			System.out.println(temp +"is not a palindrome");

	}
}
