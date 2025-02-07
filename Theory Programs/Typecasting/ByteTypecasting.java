//Widening
class ByteTypecasting 
{
	public static void main(String[] args) 
	{
		byte a = 10;
		short s = a;
		//char c = a; CTE lossy conversion
		int i =a;
		long l=a;
		float f=a;
		double d=a;
		System.out.println("Byte : "+a);
		System.out.println("short : "+s);
		//System.out.println("char : "+c);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);

	}
}
