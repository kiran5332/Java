class FrequencyCount 
{
	public static void main(String[] args) 
	{
		int num=133261555;
		System.out.println(num);

		int high = 0;
		int low = 9 ;
		int highDig = 0;
		int lowDig = 9;

		for(int i=0;i<=9;i++){

			int cnt=0;

			for(int j=num;j>0;j/=10){
				int rem=j%10;

				if(i==rem)
					cnt++;	
			}

			if(high<cnt){
				high=cnt;
				highDig=i;
			}

			if((low>cnt)&&(cnt!=0)){
				low=cnt;
				lowDig=i;
			}

			//Frequency of a number
			//if(cnt!=0)
				//System.out.println(i+" = "+cnt);
			
			//Duplicate number
			if(cnt>0)
				System.out.print(i);

		}

		System.out.println();
		System.out.println("Highest Frequency Number : "+highDig+" : "+high);
		System.out.println("Lowest Frequency Number : "+lowDig+" : "+low);
	}
}
