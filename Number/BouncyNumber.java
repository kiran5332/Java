class BouncyNumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		int prevIn=num%10;
		int prevDe=num%10;
		boolean flagIncreNum=true;
		boolean flagDecreNum=true;

		for(int i=num/10;i>0;i/=10){

			int next=i%10;
			if(next<prevIn){
				prevIn=next;
			}else{
				flagIncreNum=false;
				break;
			}

		}

		
		for(int i=num/10;i>0;i/=10){

			int next=i%10;
			if(next>prevDe){
				prevDe=next;
			}else{
				flagDecreNum=false;
				break;
			}

		}

		/* if(flagIncreNum)
			System.out.println(num+" Incresing number");
		else
			System.out.println(num+" not an Incresing number");
		
		if(flagDecreNum)
			System.out.println(num+" Decreasing number");
		else
			System.out.println(num+" not an Decresing number");*/ 

		if(flagIncreNum || flagDecreNum)
			System.out.println(num+" Bouncy number");
		else
			System.out.println(num+"  not a Bouncy number");

	}
}
