//import java.util.Scanner;
class Max1
{
  static int max=0;
  static int max1(int a[][])
   {
    for(int i=0;i<a.length;i++)
	   {
	     for(int j=0;j<a.length;j++)
			   {
		          if(a[i][j]>max)
		           {
		             max=a[i][j];
	                }
               
		        }
		 
		    }
			  System.out.println(max);
	 
	   return 0;
	    }
	  public static void main(String args[])
	   { 
        int ar[][]={{1,2,4},{4,2,5},{6,7,8}};
          max1(ar);
		  }
	     }		   
		
		   
		 
   
   
       

  