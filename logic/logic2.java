class logic2
{
	static int reverse(int no)
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
	static int summation(int rev)
	{
            int sum=0;
		while(rev!=0)
		{
			int last= rev%10;
			sum=sum+last;
			rev=rev/10;
		}
		return sum;
		}
      static int prime(int sum)
	{
		  int count=0;
	for(int i=1; i<=sum; i++)
	{
	    if (sum%i==0)
	    {
			count++;
	    }
	}
	 return count;
	}
	public static void main(String[] args) 
	{
                  int no=236321;
               int rev= reverse(no);
			   int sum=summation(rev);
			         sum=sum/2;
					 int count=prime(sum);
	   if(count==2)
		{
		System.out.println(sum+" is a prime number");
		}
		else
		{
			System.out.println(sum+" is not a prime number");
		}


              
	}
}