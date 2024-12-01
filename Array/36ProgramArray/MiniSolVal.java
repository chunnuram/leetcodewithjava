class MiniSolVal
{
	public static void main(String args[])
	{
		int count=0,c=0;
		//int ar[]={100};     //Output=9;
		//int ar[]={2,1};       //Output=3;
		//int ar[]={16,16,16};  //Output=7;
		//int ar[]={0,0,1,0,1};        //Output=2;
		int ar[]={123,234,345,456,567,678}; //Output=40;  */
		for(int i=0;i<ar.length;i++)
		{
			while(ar[i]>0)
			{
				for(int j=0;j<ar.length;j++)
				{
					if(ar[j]%2!=0)
					{
						ar[j]--;
						count++;
						c++;
					}	
				}
				if(c==0)
				{
					for(int j=0;j<ar.length;j++)
					{
						ar[j]=ar[j]/2;
					}
					count++;
				}
				c=0;
			}
		}
		System.out.println(count);
	}
}