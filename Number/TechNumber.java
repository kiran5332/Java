//divide number into equal part and both part square it if it is equal to number then it is tech number 
class TechNumber 
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=1000000;j++){

			int num=j;
			int len=0;
			int div=1;

			for(int i=num;i>0;i/=10){
				len++;
			}

			if(len%2==0){
				for(int i=1;i<=(len/2);i++){
					div*=10;
				}
				int sum = (num/div)+(num%div);
				int sqr =sum*sum;
				if(sqr==num)
					System.out.println(num);
			}

		}
	}
}
