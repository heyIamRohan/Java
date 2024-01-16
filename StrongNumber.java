class StrongNumber
{
	public static void main(String[] args) 
	{
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0){
			int fact=1;
			int rem=no%10;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
            sum=sum+fact;
			no/=10;
		}
		if(sum==copy)
			System.out.println(copy+" is a Strong Number");
		else
			System.out.println(copy+" is not a Strong Number");

	}
}
