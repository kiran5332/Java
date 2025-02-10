import java.util.Scanner;
class ConvertOddEven 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int  num = sc.nextInt();

		int newNum=0;
		int	finalNum=0;
		int length=0;

		for(int i=num;i>0;i/=10){
			length++;
		}

		if(length%2==0){
			
			for(int i=num;i>0;i/=10){
				
				int rem=i%10;

				if(rem%2==1)
					rem=rem+1;
				
				newNum=newNum*10+rem;
				
			}

			for(int i=newNum;i>0;i/=10){
				int rem=i%10;
				finalNum=finalNum*10+rem;
			}

		}else {
			
			for(int i=num;i>0;i/=10){
				
				int rem=i%10;

				if(rem%2==0)
					rem=rem+1;
				
				newNum=newNum*10+rem;
				
			}

			for(int i=newNum;i>0;i/=10){
				int rem=i%10;
				finalNum=finalNum*10+rem;
			}

		}

		//System.out.println("newNum = "+newNum);
		System.out.println("finalNum = "+finalNum);
	}
}
