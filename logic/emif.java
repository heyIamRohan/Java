class emif 
{
	public static boolean prime(int no)
	{
	int count=0;
	for(int i=1; i<=no; i++)
	{
	    if (no%i==0)
	    {
			count++;
	    }
	}
	 if(count==2)
	{
	 return true;
	}
	else
		{
		return false;
		}
	}
	public static int reverse(int no)
	{
	int rev=0;
	while(no!=0)
	{
		int rem= no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	return rev;
	}
	public static void main(String[] args) 
	{
		int no =13;
		boolean b =prime(no);
		if(b==true)
		{
		int rev = reverse(no);
		System.out.println(rev);
		boolean r=prime(rev);
		if (r==true)
		{
			System.out.println("emif");
		}
		else
		{
		System.out.println("not emif");

		}
		}
		else
		{
			System.out.println("not emif");
		}
	}
}
