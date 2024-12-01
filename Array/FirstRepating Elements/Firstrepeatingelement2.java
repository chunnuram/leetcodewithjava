class Firstrepeatingelement2
{
	static void firstnre(int x[])
	{
		int c=0;
		int z[]=new int[10];
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
			
				if(x[i]==x[j])
				{
					System.out.println(""+x[i]);
					c++;
				}	
			
			}
			if(c>0)
			break;
		}
		
	
	}
	public static void main(String args[])
	{
		int x[]={1,3,2,3,4,2,};
		firstnre(x);
	
	}

}