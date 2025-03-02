//HappyNumber
class MagicNumber 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int sum=0;

		while(num>9){
		
			while(num>0){
				sum=+num%10;
				num/=10;
			}
			num=sum;
			sum=0;
		}

		if(sum%10==1)
			System.out.println("Happy Number");
		else
			System.out.println("not a Happy Number");

	}
}
