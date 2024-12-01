class Count
{
	public static void main(String args[])
	{
		String s1="ram ram ram";
		char ch[]=s1.toCharArray();   //space of value=32
		int sum=0,count=0;
		int space=32;
		for(int i=0;i<ch.length;i++)
		{
			  sum=(int)ch[i];
			  if(sum>space)
			  {
				  count++;
			  } 
		}
		System.out.println(count);
	}
}