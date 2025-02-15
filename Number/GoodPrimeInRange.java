//Every digit in number should be the prime then it is a good prime
import java.util.Scanner;
class  GoodPrimeInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range : ");
		int range = sc.nextInt();

		int cnt=0;

		for(int i=2;i<=range;i++){

			boolean isPrime=true;
			boolean isGoodPrime=true;
			
			//Check if it is prime or not
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}	
			}
			
			//check for GoodPrime if it is prime
			if(isPrime){

				for(int k=i;k>0;k/=10){
					int rem=k%10;
					if(rem==0 || rem==1 ||rem==4 || rem==6 ||rem==8 || rem==9 ){
						isGoodPrime=false;
						break;
					}
				}

				if(isGoodPrime){
					cnt++;
					System.out.println(i +" is a GoodPrime Number ");
				}
			}

			

		}

		System.out.println("Total count within Range 2 - "+range+" : "+cnt);

	}
}
