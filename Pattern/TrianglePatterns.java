class TrianglePatterns 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=1;i<=5;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}

		int num=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}

		
		for(int i=1;i<=5;i++){
			char ch = 'a';
			for(int j=1;j<=i;j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

		char ch = 'a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2!=0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	
		int num1=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num1+" ");
				num1+=2;
			}
			System.out.println();
		}

		int num2=2;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num2+" ");
				num2+=2;
			}
			System.out.println();
		}

		int num3=1;
		char ch1='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0)
					System.out.print(ch1++ +" ");
				else
					System.out.print(num3++ +" ");
			}
			System.out.println();
		}
	}
}
