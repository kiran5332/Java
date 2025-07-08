class MockPattern 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--){
			
			for(int k=1;k<=2;k++){

				int a=i;

				for(int j=1;j<=i;j++){
					System.out.print(a-- +"*");
				}

			}

			System.out.println();

		}
		

		for(int i=0;i<5;i++){
			int a=5-i;
			for(int j=1;j<=(5-i)*2;j++){
				if(a==0)
					a=5-i;
				System.out.print(a-- +"*");
			}
			System.out.println();
		}
	}
}
