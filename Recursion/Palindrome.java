class Palindrome 
{
	public static boolean isPalindrome(int num){

		return reverse(num,0)==num?true:false;
	}

	public static int reverse(int num,int rev){
		if(num==0)
			return rev;
		return reverse(num/10,(rev*10+(num%10)));
	}

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome(101));
	}

}
