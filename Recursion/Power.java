class Power 
{

	public static int power(int base,int index){
		if(index<=0)
			return 1;

		return power(base,--index)*base;

	}

	public static void main(String[] args) 
	{
		System.out.println(power(10,3));
	}
}
