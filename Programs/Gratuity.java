import java.util.Scanner;
class Gratuity 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter subtotal : ");
		float subtotal = sc.nextFloat();

		System.out.println("Enter rate : ");
		float rate = sc.nextFloat();

		float gratuity = (rate/100)*subtotal;
		float total = subtotal+gratuity;

		System.out.println("The tip is "+gratuity+"and total is "+total);
		
	}
}
