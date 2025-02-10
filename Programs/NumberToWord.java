import java.util.Scanner;
class  NumberToWord
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();

		int rev=0;

		for(int i=num ;i>0;i/=10)
			rev=rev*10+(i%10);

		for(int i=rev;i>0;i/=10){
			int rem=i%10;

			switch(rem){
				case 1:
					System.out.print("One ");
					break;
				case 2:
					System.out.print("two ");
					break;
				case 3:
					System.out.print("three ");
					break;
				case 4:
					System.out.print("four ");
					break;
				case 5:
					System.out.print("five ");
					break;
				case 6:
					System.out.print("six ");
					break;
				case 7:
					System.out.print("seven ");
					break;
				case 8:
					System.out.print("eight ");
					break;
				case 9:
					System.out.print("nine ");
					break;
				case 0:
					System.out.print("zero ");
					break;
				default:
					System.out.println("Not a Number");

			}
		}

		System.out.println();
	}
}
