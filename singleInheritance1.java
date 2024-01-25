class A
{
	int count_number(int n){
		int count=0;
		while(n>0){
          count++;
		  n/=10;
		}
		return count;
	}
}
class B extends A
{
	void armstrong(int n){
		int count=count_number(n);
		int n1=n;
		int total=0;
		while(n>0){
           total+=(int)Math.pow(n%10,count);
		   n/=10;
		}
		if(total==n1)
			System.out.println(n1+" is the Armstrong Number");
		else
			System.out.println(n1+" is not Aramstrong Number");
	}
}
class singleInheritance1 
{
	public static void main(String[] args) 
	{
		new B().armstrong(156);
	}
}
