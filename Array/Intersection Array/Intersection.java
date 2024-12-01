public class Intersection
{
	static void intersection(int x[],int y[])
	{ 
		int c[]=new int[x.length+y.length];
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
					z[j]=0;
					c[i]=z[i];
			       }		  
				 }
		   }
	    for(int i=0;i<c.length;i++)
	    {
			if(c[i]>0)
			System.out.print("  "+c[i]);
        }
    }
	public static void main(String args[])
		 {
		  int x[]={1,2,3,2,9,9};
		  int y[]={8,9,7,2,7,6,2};
		  intersection(x,y);
		
		   }
      }	
 