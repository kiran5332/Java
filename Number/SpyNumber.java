//sum and product of digits in a number should be same
class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num=1124;
		int sum=0;
		int prod=1;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			sum+=rem;
			prod*=rem;
		}
		if(sum==prod)
			System.out.println(num+" Spy number");
		else
			System.out.println(num+" not Spy number");
	}
}
