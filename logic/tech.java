class tech 
{
	static int count_number_digits(int no)
	{
	int count=0;
	while(no!=0)
	{
		int rem = no%10;
		count++;
		no=no/10;
	}
	return count;
	}
	static int divisor(int mid)
	{
		int div=1;
		for(int i=1; i<=mid; i++)
		{
			div=div*10;
		}
		return div;
	}
	public static void main(String[] args) 
	{
		int no = 9801;
		int count = count_number_digits(no);
		if(count%2==0)
		{
			int mid = count/2;
			int div =divisor(mid);
			int firstpart=no/div;
			int lastpart=no%div;
			int sum = firstpart+lastpart;
			int square=sum*sum;
			if(square==no)
			{
			System.out.println(no +" is a Tech Number");
			}
			else
			{
			System.out.println(no +" is not Tech Number");
			}
		}
		else
		{
		System.out.println(no +" is not Tech Number");
		}
	}
}
