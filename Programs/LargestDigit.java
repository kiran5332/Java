class LargestDigit 
{
	public static void main(String[] args) 
	{
		int num = 35417;
		int max = 0;
		int min =9;

		for(int i=num;i>0;i/=10){

			int rem=i%10;
			if(max<rem)
				max=rem;

			if(min>rem)
				min=rem;

		}

		System.out.println("Largest : "+max);
		System.out.println("Smallest : "+min);

	}
}
