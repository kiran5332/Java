class  ShortNarrowing
{
	public static void main(String[] args) 
	{
		short s = 200;
		char c = (char)s;
		byte b = (byte)s;

		System.out.println("char : "+c);
		System.out.println("byte : "+b);
	}
}
