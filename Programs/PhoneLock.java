import java.util.Scanner;
class PhoneLock 
{
	public static void main(String[] args)throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
			
		
		int storePin=123;
		int seconds=5000;

		outerLoop:
		for(;;){
			int attempt=3;
			do{

				System.out.println("Enter your pin :  ");
				int pin = sc.nextInt();

				if(storePin==pin)
					break outerLoop;
				else{
					System.out.println("Wrong pin");
					System.out.println("Attempt left : "+(attempt-1));
				}

				attempt--;
				
			}while(attempt>=1);

			System.out.println("Phone disabled for "+(seconds/1000)+"Sec");
			Thread.sleep(seconds);
			seconds*=2;


		}
	}
}
