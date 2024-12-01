import java.util.*;
class SortingArrayCollection
{
	public static void main(String...g)
	{
		int temp=0;
		int ar[]={4,2,1,3,5,9,8,7};
		Arrays.sort(ar);
		for(int x:ar)
		{
			System.out.print(" "+x);
		}
	}
}
		/*for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.print(" "+ar[i]);
		}
		
	}	
}*/