class perfect 
{
	static void sub(int no)
	{
		int count = 0;
		int i;
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				if(i*i==no)
				{
				count++;
				break;
				}
			}
		}
		if(count==1)
		{
		 System.out.println(i + " is a perfect square of no");
		}
		else
		{
			System.out.println("This logic is not working for this number");
		}

	}
	public static void main(String[] args) 
	{
		sub(5);
	}
}
