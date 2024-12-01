class Min1
{
  static int min=8;
  static int min1(int a[][])
   {
    for(int i=0;i<a.length;i++)
	{
	     for(int j=0;j<a.length;j++)
		 {
		     if(a[i][j]<min)
		     {
				min=a[i][j];
		     }
		}
	}
				
			   System.out.println(min);
			   return 0;
	}
			  public static void main(String args[])
		    	{ 
			     int ar[][]={{1,2,4},
				            {4,2,5},
							{6,7,8}};
			                min1(ar);
		       }
			  }
			   
		   
		 
   
   
       

  