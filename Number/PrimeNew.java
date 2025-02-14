import java.util.Scanner;
class PrimeNew 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int dm = 2;
		while(dm<(num/2)){
			if(num%dm==0)
				break;
			dm++;
		}
		if(dm>=(num/2))
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");

	}
}
