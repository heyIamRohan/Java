 class possum
{
	static int count_digits(int no)
	{
		int count=0;
		while (no!=0)
		{
			count++;
			no=no/10;
		}
		System.out.println("Total count of digits is " + count);
		return (count);
	}
	public static int position(int no)
	{
		int pos=0;
		while(no!=0)
		{
			int rem=no%10;
			if (rem!=6)
			{
				pos++;
			}
			else {
				break;
			}
			no=no/10;
		}
		return(pos);
	
	}
	public static int sum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("The sum of digits is "+ sum);
		return sum;
	}
	public static void oddeven(int product)
	{
		if(product%2==0)
		{
			System.out.println("The product is Even. We will check for Strong Number");
			strong(product);
		}
		else
		{
			System.out.println("The product is Odd. We eill check for Prime Number");
			prime(product);
		}
	}
	public static void prime(int product)
	{
		int count = 0;
		for(int i =1;i<=product;i++)
		{
			if(product%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The product "+product +" we get is a Prime Number"); 
		}
		else
		{
			System.out.println("The product "+product+" we get is not a Prime Number");
		}
	}
	public static void strong(int product)
	{
	System.out.println("Strong Number Logic");
	int copy = product;
	int sum = 0;
	while(product!=0)
	{
		int rem = product%10;
		int fact = 1;
		for(int i = rem;i>=1;i--)
		{
			fact = i*fact;
		}
		sum = sum+fact;
		product=product/10;
	}
	if(sum==copy)
	{
		System.out.println("The Product "+copy+" is a Strong Number");
	}
	else
	{
		System.out.println("The Product "+copy+" is not a Strong Number");
	}
	}
	public static void main(String[] args) 
	{
		int no=1575613;
		int count=count_digits(no);
		int pos =position(no);
		int actual_position = count-pos;
		System.out.println("Actual position of 6 is " + actual_position);
		int sum_digits = sum(no);
		int product = actual_position*sum_digits;
		System.out.println("The product of position and sum of digits is " + product);
		oddeven(product);
	}
}