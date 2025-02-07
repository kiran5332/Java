class EvenOddSumOfDigit 
{
	public static void main(String[] args) 
	{
		int num=7264;
		int evenSum=0;
		int oddSum=0;
		int rem=0;
		int temp=0;
	
		
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		System.out.println("EvenSum"+evenSum);
		System.out.println("OddSum"+oddSum);


	}
}
