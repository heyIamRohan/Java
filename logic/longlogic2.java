class longlogic2 
{
	public static long reverse(long no)
	{
		long rev=0;
		while(no!=0)
		{
			long rem = no%10;
			rev = rev*10 + rem;
			no = no/10;
		}
		System.out.println("Reversed Number is " + rev); 
		return(rev);
	}
	public static void main(String[] args) 
	{
		long no =62111111;
		long rev = reverse(no);
		long div =rev/no;
		System.out.println("After division answer is " + div);
		int binary_count = 0;
		if(div==0)
		{
		System.out.println("The count of binary digit is "+1);
		}
		else
		{
			while(div!=0)
			{
			int rem = (int)div%10;
			if(rem==1 || rem==0 )
			{
				binary_count++;
			}
			else
			{
			 break;
			}
			div = div/10;
		    }
		System.out.println("The count of binary digit is " + binary_count);
		}
	}
}
