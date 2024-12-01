class FirstNONrepeatingElement
{
	static void firstnre(int x[])
	{
		int z[]=new int[10];
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					x[i]=0;
					x[j]=0;					
				}	
			}	
		}
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>0)
			{
				System.out.println(""+x[i]);
				break;
			}
		}	
	}
	public static void main(String args[])
	{
		int x[]={2,3,5,3,4,7,2,8,5};
		firstnre(x);
	}
}