//num+1 should be perfect square
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num=35;
		double sqrt = Math.sqrt(num+1);
		int intSqrt = (int)sqrt;

		if((intSqrt*intSqrt) == (num+1))
			System.out.println(num +" SunnyNumber");
		else
			System.out.println(num+" not a Spy number");

	}
}
