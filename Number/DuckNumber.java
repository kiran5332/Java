//number should contain at least one zero but not at first
class DuckNumber 
{
	public static void main(String[] args) 
	{
		//Taken input in string bcause nextInt() method will not consider initial zeros in input 0123 is taken as 123
		String str  = "1000";

		if(str.charAt(0)!='0'){
			if(str.contains("0"))
				System.out.println(str +" Duck Number");
			else
				System.out.println(str +" not a Duck Number");
		}else
				System.out.println(str +" not a Duck Number");
	}
}
