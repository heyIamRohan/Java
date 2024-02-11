package com.StringProgram;

public class Assignment2 {
public static void main(String[] args)
{
	String s = "Qspiders";
	s=s.toLowerCase();
	char[] c =s.toCharArray();
	int[] arr=new int [c.length];
	for(int i=0; i<c.length;i++)
	{
		int temp =0;
		int even = 1;
		int odd =0;
		if(i%2==0)
		{
			temp = c[i];
			while(temp!=0)
			{
				even = even*temp%10;
				temp=temp/10;
			}
			arr[i]=even;
		}
		else
		{
			temp = c[i];
			while(temp!=0)
			{
				odd = odd + temp%10;
				temp=temp/10;
			}
			arr[i]=odd;
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
