class ConditionalOp 
{
	public static void main(String[] args) 
	{
		int num=-45;
		String str = num%2==0?"Even":"Odd";
		System.out.println(str);

		String str2 = num>0?"Positive":"Negative";
		System.out.println(str2);
	}
}
