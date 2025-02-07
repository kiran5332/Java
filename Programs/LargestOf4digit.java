class LargestOf4 
{
	public static void main(String[] args) 
	{
		int a=210;
		int b =3;
		int c = 60;
		int d=100;

		int largest = (a>b)?((a>c)?((a>d)?(a):(d)):(c)):((b>c)?((b>d)?(b):(d)):((c>d)?(c):(d)));

		System.out.println("Largest is : "+largest);

		int smallest = (a<b)?((a<c)?((a<d)?(a):(d)):(c)):((b<c)?((b<d)?(b):(d)):((c<d)?(c):(d)));

		System.out.println("Smallest is : "+smallest);
	}
}
