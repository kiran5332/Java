class FloatNarrowing 
{
	public static void main(String[] args) 
	{
		

		float f = 3455.55f; //cant use variable because its value can change
		long l = (long)3455.55f;
		int i =(int)3455.55f;
		char c = (char)3455.55f;
		short s = (short)3455.55f;
		byte b = (byte)3455.55f;

		
		System.out.println("long : "+l);
		System.out.println("int : "+i);
		System.out.println("char : "+c);
		System.out.println("short : "+s);
		System.out.println("byte : "+b);
	}
}
