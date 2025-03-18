class RotateNumber 
{
	public static int power(int base,int index){
		if(index<=0)
			return 1;

		return power(base,--index)*base;

	}

	public static int count(int num,int count){

		if(num==0)
			return count;

		return count(num/10,++count);

	}

	public static void rotate(int num,int temp,int cnt){

		if(cnt==count(temp,0))
			return;

		System.out.println(num);

		int last = (num%10)*power(10,count(num/10,0))+(num/10);
		rotate(last,temp,cnt+1);

	}

	public static void main(String[] args) 
	{
		
		rotate(3457,3457,0);
	}
}
