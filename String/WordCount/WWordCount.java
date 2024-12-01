class WWordCount
{
	static String wordcount(String s)
	{
		int space=' ';
		int count=1;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==space||ch[i]==space-1)
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
		wordcount(s);
	}

}