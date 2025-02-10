//Temperature converter
import java.util.Scanner;
class TempConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double output=0;
		String tempStr="";

		System.out.println("Enter the Temperature in Celsius : ");
		double temp = sc.nextDouble();

		for(;;){
			
			
			System.out.println("1.Fahrenheit(F)\n2.Kelvin(K)\n3.Rankine(Ra/R)\n4.Log Out");

			System.out.println("Enter the conversion option :");
			int op = sc.nextInt();

			switch(op){

				case 1:{
					tempStr="Fahrenheit(F)";
					output=(temp*(9/5))+32;
				}
				break;
				
				case 2:{
					tempStr="Kelvin(K)";
					output=temp+273.15;
				}
				break;

				case 3:{
					tempStr="Rankine(Ra/R)";
					output=(temp+273.15)*(9/5);
				}
				break;

				case 4:
					System.exit(0);

				default:
					System.out.println("Invalid Option");

			}
			
			System.out.println();
			System.out.println();
			System.out.println("Temperature in "+tempStr +" is = "+ output);
			System.out.println();
			System.out.println();

		}

	}
}
