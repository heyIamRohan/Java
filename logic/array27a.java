class array27a 
{
	public static int reverse(int no)
	{
	int rev=0;
	while(no!=0)
		{
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		}
		System.out.println(rev);
		return rev;
	}
	public static void main(String[] args) 
	{
		int [] arr={691,762,99};
		for(int i=0;i<arr.length;i++)
		{
			int rev= reverse(arr[i]);
			arr[i]=rev;
		}
		for(int k=0;k<arr.length;k++)
		{
		System.out.println(arr[k]);
		}

		System.out.println("Hello World!");
	}
}
