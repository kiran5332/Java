import java.util.Scanner;
class UppercaseOrNot 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch>='A' && ch<='Z')?("Uppercase"):("Not a upppercase"));

		String op =((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?(ch +" is an uppercase character"):(ch +" is a Lowercase character")):((ch>='0'&&ch<='9')?(ch +" is a digit"):(ch +" is a Special character"));
		System.out.println(op);
	}
}
