import java.util.Scanner;
class YearDayCal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes :  ");
		int min = sc.nextInt();
		int minInYear =365*24*60;
		int years = min/minInYear;
		int days = (min%minInYear)/(24*60);

		System.out.println(min + " minutes means " + years + " years and " + days + " Days" );
	}
}
