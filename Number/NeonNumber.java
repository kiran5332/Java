//sum of digits in a square of a number should be equal to sum
import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		int sum=0;
		for(int i=num*num;i>0;i/=10){
			sum+=i%10;
		}

		if(sum==num)
			System.out.println(num+" Neon Number");
		else
			System.out.println(num + " not a Neon Number" );
	}
}
