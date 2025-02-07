
//Narrowing
class DoubleNarrowing 
{
	public static void main(String[] args) 
	{
		Double d = 344.55;

		float f = (float)344.55; //cant use variable because its value can change
		long l = (long)344.55;
		int i =(int)344.55;
		char c = (char)344.55;
		short s = (short)344.55;
		byte b = (byte)344.55;

		System.out.println("Float : "+f);
		System.out.println("long : "+l);
		System.out.println("int : "+i);
		System.out.println("char : "+c);
		System.out.println("short : "+s);
		System.out.println("byte : "+b);
	}
}
