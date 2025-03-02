import java.util.Scanner;
class PrimeNoInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter start : ");
		int start = sc.nextInt();

		System.out.println("Enter end : ");
		int end = sc.nextInt();

		int cnt=0;
		

		for(int num=start;num<=end;num++){
			boolean isPrime=true;
			if(num==1)
				isPrime=false;

			for(int i=2;i<num;i++){

				if(num%i==0){
					isPrime=false;
					break;
				}
					
			}

			if(isPrime){

				cnt++;
				System.out.println(num+ " is prime ");

			}

		}

		System.out.println("Prime no within range "+start+" - "+end+" = "+cnt);


	}
}
