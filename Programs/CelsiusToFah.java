//convert celsius to fahrenheit
import java.util.Scanner;
class CelsiusToFah 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temp in celsius : ");
		double celsius = sc.nextDouble();
		double fahrenhiet = ((9.0/5)*celsius)+32;
		System.out.println("Temperature in Fahrenheit is :"+fahrenhiet);
	}
}
