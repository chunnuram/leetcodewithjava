class AllTrim
{
	static String alltrim(String s)
	{
		int count1=0;
		int count=0;
		int space=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==space)
			{
				count++;
			}
			else
			{
				break;
			}
		
		}
		//System.out.print(count);
		for(int j=ch.length-1;j>=0;j--)
		{
			if(ch[j]==space)
			{
				count1++;
			}
			else{
				break;
			}
		}
		System.out.println(count1);
	
		for(int i=count;i<ch.length-count1;i++)
		{
			System.out.print(""+ch[i]);
		}
			return "0";
	}
	public static void main(String...g)
	{
		String s="    Chunnu is good boy          ";
		alltrim(s);
	}
}