class Triangle5 
{
	public static void main(String[] args) 
	{	int n=5;
		int num=1;
		int num2=1;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=i;j++){
				System.out.print(num--+" ");
				num2++;
			}
			System.out.println();
			num=num+num2;
		}
			
		int numP=0;
		for(int i=1;i<=n;i++){
			int numN=numP+i;
			numP=numN;
			for(int j=1;j<=i;j++){
				System.out.print(numN--+" ");
			}
			System.out.println();
			
		}
	}
}
