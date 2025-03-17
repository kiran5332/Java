class Addition 
{	
	public static int add(int num){
		if(num==1)
			return 1;
		return add(num-1)+num;
	}

	public static int addRange(int start ,int end){
		if(start==end)
			return end;
		return addRange(start+1,end)+start;

	}

	public static void main(String[] args) 
	{
		System.out.println(add(100));
		System.out.println(addRange(50,100));
	}
}
