import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int bjp=0, cn=0,mn=0,ss=0,aam=0,nota=0;

		System.out.println();
		System.out.println("		Welcome     ");
		System.out.println();

		System.out.println("Enter the Population : ");
		int population = sc.nextInt();

		for(int i=1;i<=population;i++){
			System.out.println();
			System.out.println("________________List of parties__________________");
			System.out.println("1.BJP");
			System.out.println("2.Congres");
			System.out.println("3.Manse");
			System.out.println("4.ShivSena");
			System.out.println("5.AAM adami");
			System.out.println("6.Nota");

			System.out.println("Enter the vote : ");
			int vote = sc.nextInt();

			if(!(vote>=1 && vote<=6)){
				i--;
				System.out.println("INVALID OPTION");
			}
			

			if(vote==1){
				System.out.println("Modi Sarkar");
				bjp++;
			}
			if(vote==2){
				System.out.println("Indira Gandhi");
				cn++;
			}
			if(vote==3){
				System.out.println("Thakre");
				mn++;
			}
			if(vote==5){
				System.out.println("Aam adami");
				aam++;
			}
			if(vote==4){
				System.out.println("Eknath shinde");
				ss++;
			}
			if(vote==6){
				System.out.println("Congratulations");
				nota++;
			}
							
			
			if(bjp>=cn && bjp>=ss && bjp>=aam && bjp>=nota && bjp>=mn ){
				System.out.println("BJP won by "+ bjp +" votes");
			}
			if(cn>=bjp && cn>=ss && cn>=aam && cn>=nota && cn>=mn ){
				System.out.println("Congress won by "+ cn +" votes");
			}
			if(ss>=cn && ss>=bjp && ss>=aam && ss>=nota && ss>=mn ){
				System.out.println("ShivSena won by "+ ss +" votes");
			}
			if(aam>=cn && aam>=ss && aam>=bjp && aam>=nota && aam>=mn ){
				System.out.println("AAM Adami won by "+ aam +" votes");
			}
			if(mn>=cn && mn>=ss && mn>=aam && mn>=nota && mn>=bjp){
				System.out.println("manse won by "+ mn +" votes");
			}
			if(nota>=cn && nota>=ss && nota>=aam && nota>=nota && nota>=mn ){
				System.out.println("nota won by "+ nota +" votes");
			}

		}
	}
}
