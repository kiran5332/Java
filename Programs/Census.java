class Census 
{
	public static void main(String[] args) 
	{
		long currPop =312032486;
		long seconds =(365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;
		long newPop = currPop+birth-death+imm;
		System.out.println("population after 5 years : "+newPop);

	}
}
