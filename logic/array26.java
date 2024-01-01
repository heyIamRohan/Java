class array26
{
	static int even_sum =0;
	static int odd_sum =0;
	public static void sum(int no)
	{
	even_sum=even_sum+no;
	}

	public static void prod(int no)
	{
	int prod=1;
	while (no!=0)
	{
		int rem = no%10;
		prod=prod*rem;
		no=no/10;

	}
	odd_sum=odd_sum+prod;
	}
	public static void main(String[] args) 
	{
		int[] arr={79,23,96,811};
		for(int i=0;i<arr.length;i++)
		{
		if(i%2==0)
			{
			sum(arr[i]);
			}
		else
			{
			prod(arr[i]);
			}
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
		int final_output=even_sum/odd_sum;
		System.out.println(final_output);

	}
}
