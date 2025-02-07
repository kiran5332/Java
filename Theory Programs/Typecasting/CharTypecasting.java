class  CharTypecasting
{
	public static void main(String[] args) 
	{
		
		char a = 'a'; 
		//short s = a; CTE lossy conversion
		int i =a;
		long l=a;
		float f=a;
		double d=a;
		
		System.out.println("short : "+s);
		System.out.println("char : "+a);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
	}
}
