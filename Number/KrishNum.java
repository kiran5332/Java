class StrongNumber 
{
	public static void main(String[] args) 
	{
		int num=144;
		int sum =0 ;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			int fact =1;
			for(int j=1;j<=rem;j++){
				fact*=j;
			}
			sum+=fact;
		}
		if(sum==num)
			System.out.println("Krish Number");
		else
			System.out.println("Not a Krish Number");


	}
}
