class ShortTypecasting 
{
	public static void main(String[] args) 
	{
		
		short a = 100;
		//char c = a; //CTE lossy conversion
		int i =a;
		long l=a;
		float f=a;
		double d=a;
		
		System.out.println("short : "+a);
		System.out.println("char : "+c);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
	}
}
