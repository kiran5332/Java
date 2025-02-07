import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		int num =new Scanner(System.in).nextInt();
		
		<!-- int sub=num;
		while(true){
			if(sub==0){
				System.out.println("Even");
				break;
			}
			if(sub==1){
				System.out.println("odd");
				break;
			}
			sub=num-2;
		}
		 -->
		System.out.println(num%2==0);
		//Logic 1
		System.out.println(num/2==num/2.0);
		//Logic 2
		System.out.println((num/2)*2==num);

	}
}
