//******************************* ARRAY OF MAX NUMBER ****************************//
import java.util.Scanner;
class Max
{
  static int max(int x[])
   {
		int max=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		 System.out.println(" THE GREATEST VALUE=> ");
         System.out.println(max);
		 return 0;
	     }
	    
	     public static void main(String args[])
	     { 
		  int n=0;
	       Scanner ob=new Scanner(System.in);
	      System.out.println("ENTER THE ARRAY OF SIZE => ");
	      n=ob.nextInt();
	      int m[]=new int[n];
		   //   int m[]={9,7,15,4,20};
		  for(int i=0;i<n;i++)
		    {
			  m[i]=ob.nextInt();
			}
 	    	 max(m) ;
      	    }
	}
	     
    