class PrimeNumber 
{

	public static boolean prime(int num,int den){

		if(den==num)
			return true;
		else if(num%den==0)
			return false;

		return prime(num,den+1);

	}

	public static void main(String[] args) 
	{
		System.out.println(prime(97,2));
	}
}
