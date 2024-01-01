class logic3
{
   static int sum(int no)
	{
	     int sum=0;
		 while(no!=0)
		{
			 int rem=no%10;
			 sum=sum+rem;
			 no=no/10;
		}
		return (sum);
	}
	static int count(int no)
	{
		int to_count=0;
		
		while(no!=0)
		{
			to_count++;
			no=no/10;
		}
		return (to_count);
	
		static int position()
	while(no!=0)
		{
		     int pos=0;
		     int rem=no%10;
			 if(rem!=6)
			{
				 pos++;
			}
			else{
				break;
			}
			no=no/10;
		}

		System.out.println("the position of digit 6 is="+(to_count-pos));
     

	}

	public static void main(String[]args)
	{
		
		int s=sum(145678);
		int p= count(s);
		System.out.println(p);
	}
		
}
