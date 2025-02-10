class  PalinStr
{

	  public static boolean isPalindrome(String s) {

        StringBuffer oldSb = new StringBuffer(s.toLowerCase());
        StringBuffer newSb = new StringBuffer();

        for(int i=0;i<oldSb.length();i++){
            char ch = oldSb.charAt(i);
            if((ch>='a' &&ch<='z')){
                newSb.append(ch);
            }
        }
        StringBuffer sbRev = newSb; 

		
		System.out.println(oldSb);
		System.out.println(newSb);
		System.out.println(sbRev);

        if(sbRev.toString().equals(newSb.reverse()))
            return true;
        else
            return false;
    }

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("race a car"));
	}
}
