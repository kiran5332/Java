//print character from username
import java.util.Scanner;
class PrintName  
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name : ");
		String name = sc.next().toUpperCase();

		for(int i=0;i<name.length();i++){

			System.out.print(name.charAt(i));
			Thread.sleep(1000);

		}
		
		System.out.println();
		System.out.println("Vowels in name are : ");

		for(int i=0;i<name.length();i++){

			char j=name.charAt(i);

			if((j=='A')||(j=='E')||(j=='I')||(j=='O')||(j=='U'))
				System.out.print(j + " ");
			
		}
		System.out.println();
	}
}
