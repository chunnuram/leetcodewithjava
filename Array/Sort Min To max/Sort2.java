//***************************** SORTING OF  MINIMAM TO MAXIMAM  ****************************//
import java.util.Scanner;
class Sort2
{

 static int temp=0;
  static int  sort(int a[])
   {
   for(int i=0;i<a.length;i++)
    {
	    for(int j=0;j<a.length;j++)
		{
		  if(a[i]<a[j])
		   {
		     temp=a[i];
		     a[i]=a[j];
		     a[j]=temp;
		    }
	    }
  		
	} 
	for(int i=0;i<a.length;i++)
	{
	 System.out.println(""+a[i]);
     	}
		return 0;
     }
	public static void main(String args[])
	{
	     int a[]={5,1,8,9,7,2};  
	     sort(a);
	
	  }
       
 }