class IntNarrowing 
{
	public static void main(String[] args) 
	{
		//cant use variable because its value can change

		
		int i =32767;
		char c = (char)32767;
		short s = (short)32767;
		byte b = (byte)32767;

		System.out.println("char : "+c);
		System.out.println("short : "+s);
		System.out.println("byte : "+b);
	}
}
