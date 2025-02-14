class EL 
{
	public static void main(String[] args) 
	{
		int num = 0011111110011;
		int cnt = 0;
		int stored = num%10;
		int len =0;
		boolean flag=false;
		

		for(int i=num ; i>0 ;i/=10){
			int rem=i%10;
			System.out.println(rem);

			if(cnt==7){
				flag=true;
				break;
			}

			if(stored==rem){
				cnt++;
				stored=rem;
				
			}else{
				cnt=0;
			}
		}

		if(flag){
			System.out.println("Dangerous situation");
		}else{
			System.out.println("No");
		}

	}
}
