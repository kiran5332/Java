class DecrementOpera 
{
	public static void main(String[] args) 
	{
		int num=100;
		System.out.println(num--);//post 100
		System.out.println(num);//99
		System.out.println(--num);//pre 98
		System.out.println(num-- + --num);//98 + 96 = 194
		System.out.println(num++ + --num); //96 + 96 = 192
	}
}
