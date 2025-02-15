import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int sum=0;
		for(int i=num;i>0;i/=10){
			sum+=(i%10);
		}
		if(num%sum==0)
			System.out.println(num+" Harshad Number ");
		else
			System.out.println(num+" Not a Harshad Number ");
	}
}
