//*****************************  ARRAY OF MIN NUMBER  ***********************//

import java.util.Scanner;
class Min
{

   static int min(int x[])
   {
     int min=15;
       for(int i=0;i<x.length;i++)
	   {
	        if(x[i]<min)
	        {
	           min=x[i];
	        }
		}
		 System.out.println("THE MIN VALUE=>");
        System.out.println(min);
		return 0;
    }
	    
    public static void main(String args[])
	{ 
	 int n=0;
	 Scanner ob=new Scanner(System.in);
	 System.out.print("ENTER THE ARRAY OF  SIZE => ");
	   n=ob.nextInt();
	  
	   
	   int m[]=new int[n];
	   //int m[]={9,7,15,4,2};
		 for(int i=0;i<n;i++)
		    {
			  m[i]=ob.nextInt();
			}
			
 	    min(m) ;
    }
}
	     
    