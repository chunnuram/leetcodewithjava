class Transpose
{
	static void transpose(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length;j++)
        {

            System.out.print("   "+a[i][j]);
        }
		System.out.print("\t\t");
		for(int j=0;j<a.length;j++)
		{
					 
			System.out.print("     "+a[j][i]);
		}
		System.out.println();
		System.out.println();
        System.out.println();
        }              					 
 }
public static void main(String args[])
	{
		int a[][]={{9,4,2},{1,8,5},{4,5,6}};
		transpose(a);
	}
}