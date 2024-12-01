class SpaceCount
{
	static String spacecount(String s)
	{
		int space=' ';
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==space)
			{
			  count++;
			}
		}	
		System.out.println(""+count);
	return "0";
	}
	
	public static void main(String...g)
	{
		String s="Ram is good Boy and very intellegent";
		spacecount(s);
	}

}