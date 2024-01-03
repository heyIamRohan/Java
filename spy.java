class spy 
{
	static int sum(int no)
	{
		int sum=0;
		while (no>0)
		{
			sum = sum + no%10;
			no=no/10;
		}
		return sum;
	}
	static int product(int no)
	{
		int prod=1;
		while (no>0)
		{
			prod = prod*no%10;
			no=no/10;
		}
		return prod;
	}
	public static void main(String[] args) 
	{
		int no=1124;
		int sum=sum(no);
		int product=product(no);
		if(sum==product)
		{
			System.out.println(no +" is Spy Number");
		}
		else
			System.out.println(no +" is not a Spy Number");
	}
}
