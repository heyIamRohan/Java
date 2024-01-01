class spy_array
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
		int arr[]={132,1124,173,625,732,22};
		for(int i=0;i<arr.length;i++)
		{
		int sum=sum(arr[i]);
		int product=product(arr[i]);
		if(sum==product)
		{
			System.out.println(arr[i] +" is Spy Number");
		}
		else
			System.out.println(arr[i] +" is not a Spy Number");
		}
	}
}
