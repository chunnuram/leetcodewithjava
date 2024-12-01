class MstringSpacecount
{
	public static void main(String...g)
	{
		int count=0;
		int space=' ';
		int temp=0;
		String s="chunnu is boy always treated as teacher";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]==space))
			{
				count++;
			}
			
		}
		System.out.println(""+count);
	
		
	}
}