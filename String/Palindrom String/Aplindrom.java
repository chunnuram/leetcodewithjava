class Aplindrom
{
	public static void main(String...s)
	{
	
		String s1="malayalam";
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
	}
}