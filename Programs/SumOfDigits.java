import java.util.Scanner;
class  SumOfDigitsInNum
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 3 digit Number : ");

		int num = sc.nextInt();
		int sum=0;
		
		sum=sum+num%10;
		num=num/10;

		sum=sum+num%10;
		num=num/10;
		
		sum=sum+num%10;
		num=num/10;

		System.out.println("Sum is : "+sum);
	}
}
