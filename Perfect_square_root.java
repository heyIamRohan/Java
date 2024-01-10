class Perfect_square_root 
{
	static void sub(int no)
	{
	double temp=0;
	double root=no/2;
	do
	{
		temp = root;
		root = (temp+(no/temp))/2;
	}
	while (temp-root!=0);
	System.out.println(root);
	}
	public static void main(String[] args) 
	{
		int no=9;
		sub(no);
	}
}
