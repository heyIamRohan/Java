class array4
{
	static int odd;
	static int even;
	static void sum(int [] arr)
	{
	int odd_sum=0;
	int even_sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2 ==1)
		{
		odd_sum= odd_sum+arr[i];
		}
		else
		{
			even_sum=even_sum+arr[i];
		}
	}
	odd=odd_sum;
	even=even_sum;
	}
	public static void main(String[] args) 
	{
		int[] arr={54,2,15,4,25};
		sum(arr);
		System.out.println( "The sum of odd elements is " +odd);
		System.out.println( "The sum of even elements is " +even);
	}
}
