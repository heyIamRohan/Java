class sphenic 
{
	public static boolean prime(int f)
	{
	int count_prime=0;
	int product=1;
	int count =0;
	for(int i=1;i<=f;i++)
	{
		if(f%i==0)
		{
		count++;
		}
	}
	if(count==2)
	{
		return true;
	}
	return false;
	}

	public static void factor(int no)
	{
		int count=0;
		int prod=1;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
		boolean b=prime(i);
		if(b==true)
		{
			if(count<=3)
			{
			count++;
			prod=prod*i;
			}
		}
		}
	}
	if(count==3&&prod==no)
	{
		System.out.println(no +" is sphenic number");
	}
	else
	{
		System.out.println(no+ " is not sphenic number");
	}
	}

	public static void main(String[] args) 
	{
		int no=30;
		factor(no);
		System.out.println("Hello World!");
	}
}
