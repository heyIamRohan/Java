class array2 
{
	static int sum(int [] arr)
	{
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum= sum+arr[i];
	}
	return sum;
	}
	public static void main(String[] args) 
	{
		int[] arr={54,2,15,4,25};
		int sum=sum(arr);
		System.out.println(sum);
	}
}
