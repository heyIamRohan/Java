class array3 
{
	static int prime(int e)
	{
		int count=0;
	for(int i=1;i<=e;i++)
	{
	if(e%i==0)
	{
		count++;
	}
	}
	return count;
	}
	public static void main(String[] args) 
	{
		int[] arr={54,2,7,4,17,34,43,97,87,78,68,90,0,43};
		for(int i=0;i<arr.length;i++)
		{
			int count=prime(arr[i]);
			if(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
