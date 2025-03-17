class CountDigit 
{
	public static int count(int num,int count){

		if(num==0)
			return count;

		return count(num/10,++count);

	}

	public static void main(String[] args) 
	{

		System.out.println(count(1789076537,0));

	}

}
