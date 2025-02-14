class Armstrongnumber
{
	public static void main(String[] args) 
	{
		int num = 153;
		int sum=0;
		int len=0;

		for(int i=num;i>0;i/=10)
			len++;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			int pow=1;
			for(int j=0;j<len;j++){
				pow*=rem;
			}
			sum+=pow;
		}

		System.out.println(num==sum?"Armstrong Number":"Not an Armstrong Number");
	}
}
