class  StaticNonstaticDemo
{
	static int a=100;
	int b=20;

	static{

		System.out.println("Static block executed");

	}

	{
		System.out.println(this);
		System.out.println("Non static block");

	}

	 StaticNonstaticDemo(){

		System.out.println("Constructer executed");

	 }

	public static void staticMethod(){

		System.out.println("Static Method");

	}

	public void nonMethod(){

		System.out.println("Non static Method ");

	}

	public static void main(String[] args) 
	{
		staticMethod();

		StaticNonstaticDemo obj = new  StaticNonstaticDemo();

		obj.nonMethod();
	}
}
