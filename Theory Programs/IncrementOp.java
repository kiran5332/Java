class IncreDecre 
{
	public static void main(String[] args) 
	{
		char ch ='a';
		System.out.println(ch++);//97
		System.out.println(++ch);//99

		float f= 3.4f;
		System.out.println(++f);

		double d= 30.444;
		System.out.println(++d);

		//String str = "kiran";
		//System.out.println(++str); only numeric datatype

		int i = 2147483647; //max limit of int
		System.out.println(++i); //-2147483648 because its a cycle
		System.out.println(--i);//

		short s = 32767; //max limit of int
		System.out.println(++s);

		byte b =127;
		System.out.println(b++);
		System.out.println(b);

		int value = 10;  
		boolean condition = true;
		//value=condition;
		System.out.println(value);
		System.out.println(value = condition ? value++ : value--);  
		System.out.println(value);

		//Drawbacks of increment and decrement

		//int num = ++10; // CTE only applied to variable not value

		int num1=1;
		//int num2 = --(++num1); //CTE --(2) required - variable found - value

		//Final variable
		final int num3 =10;
		//System.out.println(++num3); //error: cannot assign a value to final variable num3

		//boolean variable
		boolean b1 = true;
		//--b1; // error: bad operand type boolean for unary operator '--'
		System.out.println(b1);
		

		int x = 100;       
        x = x++;       
        x = x++;       
        x = x++;       
        x = x++;       
        x = x++;  
		System.out.println(x);

		int y = 1;       
        y = y++ + ++y + y++ + ++y + ++y;       
        System.out.println("Value of x : " + y);
		
	}
}
