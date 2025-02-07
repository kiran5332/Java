import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{	
		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int r=sc.nextInt();
		double area = pi*r*r;
		System.out.println("Area for radius "+r+"is = "+area);

	}
}
