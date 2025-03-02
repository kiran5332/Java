//if a number is prime then its reverse is also a prime
import java.util.Scanner;
class TwistedNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start :  ");
		int start=sc.nextInt();
		System.out.println("Enter a end :  ");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++){
			if(twistedNum(i)!=0)
				System.out.print(i+" ");
		}
		System.out.println();
	}

	public static int twistedNum(int num){

		if(isPrime(num))
			if(isPrime(reverse(num)))
				return num;

		return 0; 
	}

	public static boolean isPrime(int num){
		int den =2;
		while(den<num){
			if(num%den==0)
				return false;
			den++;
		}
		return true;
	}

	public static int reverse(int num){
		int rev=0;
		for(;num>0;num/=10){
			rev = rev*10 + num%10;
		}
		return rev;
	}

}
