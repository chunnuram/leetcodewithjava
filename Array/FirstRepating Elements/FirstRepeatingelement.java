class FirstRepeatingelement
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
					x[j]=0;
					z[i]=x[i];
				}
			}
		}
		for(int i=0;i<z.length;i++)
		{
			if(z[i]>0)
			{
			System.out.println(""+z[i]);
			}
		}		
	   
	   	   
	}

	public static void main(String args[])
	{
		int x[]={1,3,2,3,4,2,};
		firstnre(x);
	
	}

}