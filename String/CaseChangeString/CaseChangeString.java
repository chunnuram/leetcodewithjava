class CaseChangeString
{
	static String changecase(String s,String s1)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			sum=(int)ch[i];
			if(sum<=91&&sum>32)
			{
				ch1[i]=(char)(sum+32);
			}
			else if(sum>91&&sum>32)
			{
				ch1[i]=(char)(sum-32);
			}
			System.out.print(""+(char)ch1[i]);
						
			}	
		return "0";
	}
	public static void main(String...g)
	{
		String s="rAM IS GooD BoY";
		String s1="";
		changecase(s,s1);
	}
}