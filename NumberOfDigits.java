 class NumberOfDigits
{
	static int count(int no)
	{
		int total_count=0;
		while (no!=0)
		{
			total_count++;
			no=no/10;
		}
		return (total_count);
	}
	public static void main(String[] args) 
	{
		int no=2738;
		int total_count=count(no);
		System.out.println("The Number of digit in "+no+" is = "+(total_count));
	}
}