class arrays27assignment 
{
	static int reverse(int n){
		int rev=0;
		while(n>0){
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	static void reverseArrayElement(int [] a){
         for(int i=0;i<a.length/2;i++){
          int temp=a[i];
		  a[i]=a[a.length-i-1]; 
          a[a.length-i-1]=temp;
		}
	}
	static int mul(int n){
		int m=1;
		while(n>0){
			m*=n%10;
			n/=10;
		}
		return m;
	}
	static boolean prime(int n){
		if(n==0 || n==1)
			return false;
        for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int addition_digit(int n){
		int sum=0;
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		return sum;
	} 
	static boolean spynum(int n){
		int sum=addition_digit(n);
		int mul=mul(n);
		if(sum==mul)
			return true;
		return false;
	}
	static void fibonacci(int n){
		if(n==0)
			return;
		if(n==1)
			System.out.println(0);
		long fib1=0;
		long fib2=1;
        System.out.print(fib1+" "+fib2);
		for(int i=2;i<=n;i++){
			long fib3=fib1+fib2;
            System.out.print(" "+fib3);
			fib1=fib2;
			fib2=fib3;
		}

	}
	public static void main(String[] args) 
	{
		int [] a={691,366,25};
		for(int i=0;i<a.length;i++){
			a[i]=reverse(a[i]);
		}
		reverseArrayElement(a);
        //System.out.println(a[0]+" "+a[1]+" "+a[2]);
		for(int i=0;i<a.length;i++){
			if(i==0){
				int mul=mul(a[i]);
              System.out.println(prime(mul)?mul+" is a Prime Number":mul+" is not a Prime Number");
			}
			else if(i==1){
				int n=addition_digit(a[i]);
               System.out.println(spynum(n)?n+" is a SPY Number":n+" is not a SPY Number");
			}
			else if(i==2){
               fibonacci(a[i]);
			}
		}

	}
}
