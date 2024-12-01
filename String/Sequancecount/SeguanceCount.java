class SeguanceCount
{
	static void sequencecount(String  s)
	{
		int count=1;
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=2;
			sum=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=0;
					sum=count;
					count++;			
				}
			}
			if(ch[i]>0)
			{
				System.out.print(ch[i]+"="+sum);
				System.out.println();
			}	
		}
	}
	public static void main(String...g)
	{
		String s="RamRamRamSitaSitaSita";
		sequencecount(s);
	}
   
}