import java.util.Scanner;

class Game1 
{
	public static void main(String[] args) 
	{
		int codeNum = 0;
		String bot = null;
		int userNum = 0;
		String user = null;

		Scanner sc = new Scanner(System.in);

		for(; ;){
			
			int num=(int)(Math.random()*10);
			if(num>=1 && num<=3){
				codeNum=num;
				break;
			}

		}

		if(codeNum==1){
			bot = "Stone";
		}else if(codeNum==2){
			bot = "Paper";
		}else if(codeNum==3){
			bot = "Scissor";
		}else{
			return;
		}
		
		System.out.println("1.Stone\n2.Paper\n3.Scissor");
		System.out.print("Enter your choice : ");
		userNum=sc.nextInt();
	
		
		if(userNum==1){
			user = "Stone";
		}else if(userNum==2){
			user = "Paper";
		}else if(userNum==3){
			user = "Scissor";
		}else{
			System.out.println("INVALID OPTION");
			return;
		}

		
		if((codeNum==3 && userNum==1)||(codeNum==1 && userNum==2)||(codeNum==2 && userNum==3)){
			System.out.println("User Wins");
			System.out.println("User :"+user +"Bot : "+bot);
		}else if((codeNum==2 && userNum==1)||(codeNum==3 && userNum==2)||(codeNum==1 && userNum==3)){
			System.out.println("Bot Wins");
			System.out.println("User :"+user +" \nBot : "+bot);
		}else{
			System.out.println("DRAW");
		}

	}

		
}
