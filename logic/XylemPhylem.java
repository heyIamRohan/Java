class XylemPhylem 
{
	static void xylem(int no)
	{
	int last_digit=no%10;
	no=no/10;
	int middlesum=0;
	int firstlastsum=last_digit;
	while(no!=0)
	{
		int digit=no%10;
		if(digit==no)
		{
			firstlastsum=last_digit+digit;
		}
		else
		{
			middlesum=middlesum+digit;
		}
		no=no/10;
	}
	if(firstlastsum==middlesum)
		{
		System.out.println("Xylem Number");
		}
		else
			{
			System.out.println("Phyleom Number");
			}
	}
	public static void main(String[] args) 
	{
		int no = 1234;
		xylem(no);
		System.out.println("Hello World!");
	}
}
