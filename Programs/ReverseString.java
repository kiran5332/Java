import java.util.Scanner;

class  ReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String str = sc.next();

		String strRev1="";
		String strRev2="";
		String strRev3="";

		for(int i=0;i<str.length();i++)
			strRev1=str.charAt(i)+strRev1;
		
		for(int i=str.length()-1;i>=0;i--)
			strRev2=strRev2+str.charAt(i);

		StringBuffer sf = new StringBuffer(str);
		strRev3=sf.reverse().toString();

		if(str.equals(strRev1)){
			System.out.println("Palindrome String ");
		}else{
			System.out.println("Not A palindrome String ");
		}

		System.out.println("str1 = "+strRev1);
		System.out.println("str2 = "+strRev2);
		System.out.println("str3 = "+strRev3);


	}
}
