import java.util.Scanner;
class AreaPerimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height : ");
		float height = sc.nextInt();
		System.out.println("Enter the width : ");
		float width = sc.nextInt();
		float area = height*width;
		float perimeter = 2*(height+width);
		System.out.println("Area of rectangle is : " + area);
		System.out.println("perimeter of rectangle is : " + perimeter);
	}
}
