class Vowelcount
{
	static String vowelcount(String s,String s1)
	{
			int count=0;
			char ch[]=s.toCharArray();
			char ch1[]=s1.toCharArray();
			//String s1="   Ram is good boy ";
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch1.length;j++)
				{
				if(ch[i]==ch1[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
		return "0";
		}
	public static void main(String...g)
	{
		String s="aeiou";
		String s1=" Rama is very intellegent boy";
		vowelcount(s,s1);
	}
}