import java.util.Arrays;
class  array29
{
	public static boolean prime(int no)
	{
	int count=0;
	for(int i=1; i<=no; i++)
	{
	    if (no%i==0)
	    {
			count++;
	    }
	}
	 if(count==2)
	{
	 return true;
	}
	else
		{
		return false;
		}

	}
	public static void main(String[] args) 
	{
		boolean response = false; 
		int[] arr={3,4,99,23,45,23,56,78,97};
		boolean[] abb=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		response=prime(arr[i]);
		if(response==true)
			{
			abb[i]=true;
			}
			else
			{
			abb[i]=false;
			}
		}
		for(int k=0;k<abb.length;k++)
		{
		System.out.print(abb[k] + " ");
		}
		//System.out.println();
		System.out.println("\n"+Arrays.toString(abb));

	}
}
