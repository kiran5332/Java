class PrintAlpha 
{
	public static void main(String[] args) 
	{	
		char ch='A';
		char ch2='a';

		while(ch<='Z'){
			System.out.println(ch++);
		}

		while(ch2<='z'){
			System.out.println(ch2++);
		}
	}
}
