class  CharNarrowing
{
	public static void main(String[] args) 
	{
		
		char c = '8';
		short s = (short)c;
		byte b = (byte)c;

		System.out.println("short : "+s);
		System.out.println("byte : "+b);
	}
}
