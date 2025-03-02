class EvilNumber 
{
	public static void main(String[] args) 
	{
		int num=122;
		int cnt=0;
		String bin = Integer.toBinaryString(num);
		
		for(int i=0;i<bin.length();i++){
			if(bin.charAt(i)=='1')
				cnt++;
		}

		System.out.println(bin);
		System.out.println(cnt%2==0?num+" is Evil Number":num+" is not an Evil Number");
	}
}
