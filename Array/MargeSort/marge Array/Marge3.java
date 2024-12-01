class Marge3
{
  static void marge(int x[],int y[])
   { 
		int temp[]=new int[10];
		int z[]=new int[10];
     for(int j=0;j<x.length;j++)
		{
			z[j]=x[j];
			for(int i=0;i<y.length;i++)
			{
				z[i+x.length]=y[i];
			}
		}
	   for(int i=0;i<z.length;i++)
	    {
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]>z[j])
					{
						temp[i]=z[i];
						z[i]=z[j];
						z[j]=temp[i];
					}	
			}
		}
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]==z[j])
				{
					z[j]=0;
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
		int a[]={1,2,3,2,9};
		int b[]={8,9,7,7,6};
		 marge(a,b);
		}
     }  