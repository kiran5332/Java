import java.util.Scanner;
class Input 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Byte : ");
		byte b = sc.nextByte();
		System.out.print("Enter short : ");
		short s = sc.nextShort();
		System.out.print("Enter int : ");
		int i = sc.nextInt();
		System.out.print("Enter long : ");
		long l = sc.nextLong();

		System.out.print("Enter float : ");
		float f = sc.nextFloat();
		System.out.print("Enter Double : ");
		double d = sc.nextDouble();

		System.out.print("Enter char : ");
		Object o = sc.next().charAt(0);

		
		System.out.print("Enter boolean : ");
		boolean bool = sc.nextBoolean();
		System.out.println("remaining character"+sc.nextLine()+"kkkkkk");
		System.out.print("Enter address : ");
		String add = sc.nextLine();

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(o);
		System.out.println(bool);
		System.out.println(add);


	}
}
