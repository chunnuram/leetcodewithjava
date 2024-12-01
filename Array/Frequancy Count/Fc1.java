class Fc1
{
  static void fc(int x[])
  {
	  int count=1;
	  int sum=0;
	for(int i=0;i<x.length;i++)
	{
	   count=2;
	   sum=1;
	for(int j=i+1;j<x.length;j++)
	{
		if(x[i]==x[j])
		{
			x[j]=0;
		    sum=count;
            count++;			
		}
	}
	if(x[i]>0)
	{
	    System.out.print(x[i]+" ="+sum);
	    System.out.println();
	}	
   }
   
  }
public static void main(String args[])
{
 int x[]={3,4,2,3,4,3,4,3,4};
 fc(x);
 }
 }

