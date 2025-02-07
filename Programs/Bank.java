import java.util.Scanner;
class Bank 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		String userName = null;
		String password = null;
		String address = null;
		double balance = 0.0;
		long contact = 0;
		
		
		for(; ;){

			System.out.println("_________WELCOME___________");
			System.out.println("_________Bank Of Maharashtra___________");
			System.out.println("1.Create Account\n 2.Existing User");
			System.out.println();

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			

			if(choice==1){

				System.out.println("Enter Your name : ");
				userName = sc.next();
				System.out.println("Enter Your password : ");
				password = sc.next();
				sc.nextLine();
				System.out.println("Enter Your address : ");
				address = sc.nextLine();
				System.out.println("Enter Your contact : ");
				contact = sc.nextLong();
				System.out.println("Enter Balance amount : ");
				balance = sc.nextDouble();
				System.out.println(" Account Created Successfully !!!!");

			}else if(choice==2){

				if(userName==null){
					System.out.println();
					System.out.println();
					System.out.println("^^^^^^^^^^^Create Account First^^^^^^^^^^^^^^");
					System.out.println();
					System.out.println();
					continue;
				}
			
				
				for(int i =3;i>=1;i--){

					System.out.println("Enter Your name home : ");
					String userName1 = sc.next();
					System.out.println("Enter Your password : ");
					String password1 = sc.next();
					
					if((userName1.equals(userName))&&(password.equals(password1))){

						System.out.println("____________ Login Successfull___________");
						
						home:
						for(;;){
								System.out.println();
								System.out.println("1.Deposit\n2.withdraw\n3.check balance\n4.Mini statement\n5.log out");
						
								System.out.println();
								System.out.println("Enter your choice : ");
								int ch = sc.nextInt();

								switch(ch){

									case 1:
									{
										System.out.println("Enter amount to deposit :  ");
										balance+=sc.nextDouble();
									}
									break;
									
									case 2:
									{

										System.out.println("Enter Your password : ");
										String password2 = sc.next();

										if((password.equals(password2))){

											System.out.println("Enter amount to withdraw :  ");
											double amount = sc.nextDouble();

											if(amount<=balance){
												balance-=amount;
											}else{
												System.out.println("Insufficient balance");
											}

										}else{
											System.out.println("--------INVALID LOGIN CREDENTIALS------");
										}
										
									}
									break;

									case 3:
									{

										for(int j =3;j>=1;j--){

												System.out.println("Enter Your password : ");
												String password2 = sc.next();

												if((password.equals(password2))){
													System.out.println("ACCOUNT BALANCE = "+balance);
													continue home;
												}else{
													System.out.println("--------INVALID PASSWORD-------");
													System.out.println("Attempt left : "+(j-1));
												}

										}
										System.out.println("Your account Locked for 24 hours");
										
									}
									break;

									case 4:
									{
										System.out.println("Mini Statement");
										
									}
									break;

									case 5:
									{
										System.out.println("----LOG OUT----");
										System.exit(0);
									}
									break;

									default:
									{
										System.out.println("Invalid Option ");	
									}
									
								}

						}
				

					}else{
						System.out.println("**** Invalid Login Credentials ****");
						System.out.println("Attempt left"+(i-1));
					}

				}


			}else{
				System.out.println("INVALID OPTION");
				System.exit(0);
			}
		}
	}
}
