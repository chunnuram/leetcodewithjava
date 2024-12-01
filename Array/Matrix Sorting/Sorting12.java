class Sorting12
{
	public static void main(String...g)
	{
		int n=0;
		int a=0;
		int b=0;
		int temp=0;
		int ar[][]={{8,7,5},{3,4,1},{0,9,6}};
		int br[]=new int[(ar.length*ar.length)];
		{
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					br[n]=ar[i][j];
					n++;
				}
			}
			for(int i=0;i<br.length;i++)
			{
				for(int j=i+1;j<br.length;j++)
				{
					if(br[i]>br[j])
					{
						temp=br[i];
						br[i]=br[j];
						br[j]=temp;
					}
				}
			}
			for(int i=0;i<br.length;i++)
			{
				ar[a][b]=br[i];
				if(b==2)
				{
					a++;
					b=-1;
				}
			b++;
			}
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					System.out.print("\t"+ar[i][j]);
				}
				System.out.println("");
			}
		}	
	}
}