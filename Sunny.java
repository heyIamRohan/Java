class Sunny 
{
	static void sunny(int n)
	{
		double sqrt = Math.sqrt(n);
		double sqrt1 = Math.floor(sqrt);
		System.out.println(sqrt1);
		int no = n-1;
		if(sqrt - sqrt1 ==0)
		{
			System.out.println(no +  " " + "is sunny number");
		}
		else
		{
			System.out.println(no +" " + "is not sunny");
		}
	}
	public static void main(String[] args) 
	{
		int n = 4;
		n = n+1;
		sunny(n);
	}
}
