//numbner shiould be divisible by 7 or should contain 7 at last
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
		if(num%10==7 || num%7==0)
			System.out.println(num + " Buzz Number");
		else
			System.out.println(num + " not a Buzz Number");
	}
}
