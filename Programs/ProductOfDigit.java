class ProductofDigit 
{
	public static void main(String[] args) 
	{
		int digit =1521;
		int product=1;

		product=product*(digit%10);
		digit = digit/10;

		product=product*(digit%10);
		digit = digit/10;

		product=product*(digit%10);
		digit = digit/10;

		product=product*(digit%10);
		digit = digit/10;

		System.out.println("Product : "+product);

	}
}
