class  PrintNumber
{
	public static void printNum(int n ){
		
		if(n<=0)
			return;
		System.out.println(n);
		printNum(--n);

	}

	public static void printNum2(int start ,int end){

		if(start>end)
			return;

		System.out.println(start);
		printNum2(++start,end);

	}

	public static void printNum3(int num){

		if(num<=0)
			return;

		int temp = num;
		printNum3(--num);
		System.out.println(temp);
	}

	public static void printNum4(int num){

		if(num<=0)
			return;

		System.out.println(num);
		printNum4(--num);
		
	}

	public static void main(String[] args) 
	{
		//printNum(10);
		//printNum2(1,10);
		printNum3(5);
		System.out.println("-----");
		printNum4(5);
	}
}
