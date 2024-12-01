class  Wordcount
{
	public static void main(String args[])
	{
		int count=1;
		char space=' ';
		String s="He ram is good boy ram shyam deepak radhey munna virendra surendra rahul adanan";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==space||ch[i]==space-1)
			{
				count++;
			}	
		}
		System.out.print(""+count);
	}
}