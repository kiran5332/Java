class MethodOverLoading 
{

	public static void main(String[] args) 
	{
		add(20,60);
		add('a','b');
		add("kiran","Pawar");
		add(3.87,4.56);
	}

	public static int add(int a,int b){
		System.out.println(a+b);
		return 0;
	}

	public static void add(double a,double b){
		System.out.println(a+b);
	}

	public static void add(char a,char b){
		System.out.println(a+b);
	}

	public static void add(String a,String b){
		System.out.println(a+b);
	}

}
