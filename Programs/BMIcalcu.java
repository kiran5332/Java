import java.util.Scanner;
class BMICalculater 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in pounds : ");
		float pounds = sc.nextFloat();

		System.out.println("Enter height in inches : ");
		float inches = sc.nextFloat();

		float weight=pounds*0.45359237f;
		float height=inches*0.0254f;

		float bmi = weight/(height*height);

		System.out.println("BMI for Weight "+ weight + " and height " +height +" is " +bmi);

	}
}
