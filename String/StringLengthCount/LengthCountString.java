class LengthCountString
{
	static String lengthcount(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		return String.valueOf(count);
	}
	public static void main(String...g)
	{
		String s="Ram is good Boy";
		String s1=lengthcount(s);
		System.out.println(s);
		System.out.println("Length of String => "+s1);
	}
}