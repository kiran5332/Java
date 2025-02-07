class LongNarrowing 
{
	public static void main(String[] args) 
	{
		//cant use variable because its value can change
		long l = 345555444l;
		int i =(int)345555444l;
		char c = (char)345555444l;
		short s = (short)345555444l;
		byte b = (byte)345555444l;

		System.out.println("int : "+i);
		System.out.println("char : "+c);
		System.out.println("short : "+s);
		System.out.println("byte : "+b);
	}
}
