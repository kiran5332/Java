class EvenLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("EVEN Numbers 1-100");

		for(int i=1;i<=100;i++){
			if(((i/2)*2)==i){
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("ODD Numbers 1-100");

		for(int i=100;i>=1;i--){
			if(((i/2)*2)!=i){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
