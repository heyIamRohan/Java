package logic;

public class Mix {
	public static void main(String[]args)
	{
		String s = "SU8N31";
		int sum =0;
		for(int i = 0; i<s.length();i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				;
			}
			else
			{
				
				sum += s.charAt(i)-'0';

			}
		}
		System.out.println(sum);
	}

}
