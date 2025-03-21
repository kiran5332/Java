class Armstrong 
{
	public static boolean isArmstrong(int num){
		System.out.println(armstrong(num,num,0));
		return armstrong(num,num,0)==num?true:false;

	}

	public static int armstrong(int temp,int num ,int sum){

		if(num==0)
			return sum;
		sum+=power(num%10,count(temp,0));
		return armstrong(temp,num/10,sum);

	}

	public static int power(int base , int index){

		if(index==0)
			return 1;
		return base*(power(base,--index));

	}

	public static int count(int num,int count){

		if(num==0)
			return count;
		return count(num/10,++count);

	}

	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153));
	}

}
