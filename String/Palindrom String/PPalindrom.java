class PPalindrom
{
	static String palindrom(String s1)
	{
		char ch[]=s1.toCharArray();
			int count=0;
		for(int i=0;i<ch.length;i++)
		{
		
			if(ch[i]==ch[ch.length-1-i])
			{
				count++;
			}
			
		}
		if(count==s1.length())
		{
		System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		return "0";
	}
	public static void main(String...g)
	{
		String s1="malayalam";
		palindrom(s1);
	}
}