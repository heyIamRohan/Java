class logic1
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
	static int summation(int no)
	{
            int sum=0;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
		}
		static int facto(int no)
	{
            int fact=1;
		for(int i=1; i<=no; i++)
		{
			int rem= no%10;
			fact=fact*rem;
			no=no/10;
		}
		return fact;
		}
	public static void main(String[] args) 
	{
                  int no=143;
               int rev= reverse(no);
			   int sum=summation(rev);
			   int fact=facto(sum);
              System.out.println(fact);
	if(rev==no)
		{
		   System.out.println(no+"is a palindrome number");
		}
	else
		{
        System.out.println(no+"is not a palindrome number");
	    }

    }
}