import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter th value in INR :  ");
		float inr = sc.nextFloat();

		float currCon = 0;

		System.out.println("___________List of Currencies ______________");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.PAK");
		System.out.println("4.GDP");
		System.out.println("5.AUS");//54.31
		System.out.println("6.AFN");//1.15
		
		System.out.println("Enter Currency :  ");
		String  curr = sc.next().toUpperCase();

		if(curr.equals("USD")){
			currCon = inr/86.57f;
		}else if(curr.equals("EUR")){
			currCon = inr/90.55f;
		}else if(curr.equals("PAK")){
			currCon = inr/0.310f;
		}else if(curr.equals("GBP")){
			currCon = inr/107.74f;
		}else if(curr.equals("AUS")){
			currCon = inr/54.31f;
		}else if(curr.equals("AFN")){
			currCon = inr/1.15f;
		}else{
			System.out.println("Invalid option ");
		}
		

	}

}
