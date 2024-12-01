class MstringCharcount22
{
	public static void main(String...g)
	{
		int count=0;
		int space=' ';
		String s="chunnu is bad boy";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			if((ch[i]>space))
			{
				count++;	
			}
		}
		System.out.println(""+count);
	}
}