class BinaryToDecimal 
{

	public static int pow(int n, int pow){
		int prod=1;
		for(int i=0;i<pow;i++){
			prod*=2;
		}
		return prod;
	}

	public static void main(String[] args) 
	{
		int num=0;
		String bin="11111";

		System.out.println(Integer.parseInt(bin,2));

		StringBuilder sb = new StringBuilder(bin);
		sb.reverse();

		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='1')
				num+=pow(2,i);
		}

		System.out.println(num);

	}
}
