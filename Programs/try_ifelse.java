class $_
{
	public static void main(String[] args) 
	{

		//if else without block allowed but only one statement 
		if(!true)
			System.out.println("_________If executed_______ ");
			
		// no statement other than commnet allowed between if and else
		else
			System.out.println("--------else executed-------- ");

		//compound assign implicit narrowing
		int i=1;
		//i=i+2.0;
		i+=2.0;

		System.out.println(i);

		System.out.println(0==0.0);
	}
}