class PrintPattern 
{
	public static void pattern(int n){

		int count=0;
		boolean flag=false;

		for(int i=1;i<=n;i++){

			if((count<=5 && count>0) && !flag){
				count++;
				System.out.print(i+" ");
			}else{
				count=0;
				flag=true;
				System.out.print("*"+" ");
			}
				
		}

	}

	public static void main(String[] args) 
	{
		pattern(19);
	}
}
