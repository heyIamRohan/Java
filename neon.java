class neon 
{
	static int sum(int square)
	{
		int sum=0;
		while(square!=0)
		{
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		System.out.println("Sum of digits of number we get after squaring the given number is "+sum);
		return sum;

	}
	public static void main(String[] args) 
	{
		int no=45;
		System.out.println("Given Number is "+no);
		int square = no*no;
		System.out.println("Square or the number "+no+" is " +square);
		int sum = sum(square);
		if(sum==no)
		{
			System.out.println(no +" is Neon Number");
		}
		else
		{
		System.out.println(no+" is Not Neon Number");
		}
	}
}
