class MethodChaining 
{
	{
		System.out.println("In Non Static block");
	}

	public MethodChaining method1(){
		System.out.println("Method 1");
		System.out.println(this);
		return this;
	}

	public MethodChaining method2(){
		System.out.println("Method 2");
		System.out.println(this);
		return this;
	}

	public MethodChaining method3(){
		System.out.println("Method 3");
		System.out.println(this);
		return this;
	}

	public static void main(String[] args) 
	{
		MethodChaining m1 = new MethodChaining();
		System.out.println(m1.method1().method2().method3());
	}

}
