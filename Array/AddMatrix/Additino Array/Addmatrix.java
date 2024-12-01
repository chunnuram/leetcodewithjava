class Addmatrix
{
  static int sum=0;
  static void add(int a[][],int b[][])
  {
   for(int i=0;i<a.length;i++)
     {
	  for(int j=0;j<a.length;j++)
	    {
			System.out.print(" \t "+a[i][j]);
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.print(" \t     "+b[i][j]);
		}
			System.out.println();
			System.out.println();
		}
		    System.out.println("\t");
	    for(int i=0;i<a.length;i++)
		{			
		for(int j=0;j<b.length;j++)
		{
			sum=0;
			sum=sum+a[i][j]+b[i][j];
				      
			System.out.print( "\t   "+sum);
		}			
            System.out.println();
			System.out.println();
		}
	}		
   public static void main(String args[])
   {
     int a[][]={{9,1,7},{1,9,8},{2,4,5}};
	 int b[][]={{1,6,7},{4,5,6},{2,4,5}};
       add(a,b);
    }
}