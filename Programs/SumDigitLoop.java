import java.util.Scanner;
class SumofDigitLoop
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Num : ");
		int num = sc.nextInt();
		int temp = num;
		int sumTotal =0;
		int sumEven =0;

		while(num>0){
			int rem = num%10;
			sumTotal+=rem;
			num/=10;
		}

		System.out.println(sumTotal);
		System.out.println(temp);
		
		while(temp>0){
			int rem = temp%10;
			if(rem%2==0)
				sumEven+=rem;
			temp/=10;
		}

		System.out.println(sumEven);

	}
}
