class logic3
{
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
	static int summation1(int sum)
	{
            int sum1=0;
		while(sum!=0)
		{
			int a= sum%10;
			sum1=sum1+a;
			sum=sum/10;
		}
		return sum1;
		}
	public static void main(String[] args) 
	{
                  int no=999999;
			   int sum=summation(no);
			 int sum1=summation1(sum);
        System.out.println(sum1);
	}
}