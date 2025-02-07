class  LoopExample
{
	public static void main(String[] args) 
	{
		//1-10
		for(int i=1;i<=10;i++){
			System.out.print(i+"  ");
		}
		System.out.println();

		//A-Z
		for(char i='A';i<='Z';i++){
			System.out.print(i+"  ");
		}

		System.out.println();

		//Z-A
		for(char i='Z';i>='A';i--){
			System.out.print(i+"  ");
		}

		System.out.println();

		//0-9
		for(char i='0';i<='9';i++){
			System.out.print(i+"  ");
		}

		System.out.println();

		//ASCII table
		for(int i=0;i<=127;i++){
			System.out.println(i+" : "+((char)i));
		}


	}
}
