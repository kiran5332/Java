import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter alphabet : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch + "  is Vowel"):(ch + " is consonent"));

		
	}
}
