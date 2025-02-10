import java.util.Scanner;
class ReverseInteger 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		long rev=0;
		boolean flag=false;

		if(num<0){
			flag=true;
			num = Math.abs(num); 
		}
		
		
		for(int i =num;i>0;i/=10){
			rev=rev*10 +(i%10);
		}

		
		if(flag){
			rev*=(-1);
		}

		if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE){
			rev=0;
		}

		System.out.println(rev);
	}
}
