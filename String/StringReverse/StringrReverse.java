class StringrReverse
{
	static String reverse(String s)
	{
		int space=' ';
		char ch[]=s.toCharArray();
			System.out.print("First String=");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("\t"+ch[i]);
		}
		System.out.print("\n");
		System.out.print("Reverse String=");
			
		for(int i=ch.length-1;i>=0;i--)
		{
		
			System.out.print("\t"+ch[i]);
		}
		return "0"; 
	}
	public static void main(String...g)
	{
		String s= "Ram  is good boy";
		reverse(s);
	}
}