//season
import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month : ");

		String month = sc.next();
		System.out.println(month);

		String output = (((month =="OCT")||(month =="NOV")||(month =="DEC")||(month =="JAN"))?("Its winter"):
						(((month =="FEB")||(month =="MAR")||(month =="APR")||(month =="MAY"))?("Its Summer"):
						((((month =="JUN")||(month =="JUL")||(month =="AUG")||(month =="SEP"))?("Its Mansoon"):("Enter valid month"))));

		System.out.println(output);

	}
}
