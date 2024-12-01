class CaseChange
{
	
	public  static void main(String args[])
	{
		String s1="abcdefghijklmnopqrstuvwxyz";
		char ch[]=s1.toCharArray();
		int sum=0;
		for(int i=0;i< ch.length;i++)
		{
			sum=(int)ch[i];
			if(sum<97&&sum>32)   // 32 is value of 'spce' && 32 is a diffrence between 97(a) and 65(A)
			{
				ch[i]=(char)(sum+32);
			}
			else if (sum>=97&&sum>32)
			{
			ch[i]=(char)(sum-32);
			}
			System.out.print(""+(char)ch[i]);
		}
	}
}