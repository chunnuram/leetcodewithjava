public class Union
{
	static void marge(int x[],int y[])
	{ 
		int z[]=new int[x.length+y.length];
		for(int j=0;j<x.length;j++)
		{
			z[j]=x[j];
        }
		for(int i=0;i<y.length;i++)
	    {
			z[x.length+i]=y[i];
	    }
		for(int i=0;i<z.length;i++)
	    {
			for(int j=i+1;j<z.length;j++)
		    {
				if(z[i]==z[j])
			    {
					z[i]=0;
			    }
		    }
	    }
	    for(int i=0;i<z.length;i++)
	    {
			if(z[i]>0)
			{
				 System.out.print("  "+z[i]);
			}
        }
    }
	public static void main(String args[])
	{
		int x[]={1,2,3,2,9};
		int y[]={8,9,7,2,7,6,2};
		marge(x,y);
		}
    }	
 
	    
	    