class RemoveAllsapce
{
	static String squeezeremovespce(String s)
	{
		int space=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>space)
			{
				System.out.print(""+ch[i]);
			}
		}
		return "0";
	}
	public static void main(String...g)
	{
		String s="  R a  m  is b  o  y";
		squeezeremovespce(s);
	}
}