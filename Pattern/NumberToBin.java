class NumberToBin 
{
	public static void main(String[] args) 
	{
		int num =10;
		String bin="";

		System.out.println(Integer.toBinaryString(num));

		while(num>0){
			bin=num%2+bin;
			num/=2;
		}
		System.out.println(bin);

	}
}
