 class position
{
	static int count(int no)
	{
		int total_count=0;
		while (no!=0)
		{
			total_count++;
			no=no/10;
		}
		return (total_count);
	}
	public static void main(String[] args) 
	{
		int no=2738;
		int total_count=count(no);
		int pos=0;
		while(no!=0)
		{
			int rem=no%10;
			if (rem!=7)
			{
				pos++;
			}
			else {
				break;
			}
			no=no/10;
		}
		System.out.println("the position of digit 7 is ="+(total_count-pos));
	}
}