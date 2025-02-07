//Unary op
//comparison does
//returntype boolean
class RelationalOp 
{
	public static void main(String[] args) 
	{
		System.out.println(0<0.0);//false
		System.out.println(59.999==60);//false
		System.out.println(97!=100);//true
		System.out.println('a'<'A');//false
		System.out.println('z'<=122);//true
		//System.out.println(false<true);//CTE
		System.out.println(false==true);//false
		System.out.println(false!=false);//false
		System.out.println(true==true);//true
		System.out.println(22/7 >= 22.0/7.0);//false
		System.out.println(22/7);//false
		System.out.println(22.0/7.0);//false
		System.out.println(22.0/7.0>=22.0f/7.0f);//false
		System.out.println(22.0f/7.0f);
		
	}
}
