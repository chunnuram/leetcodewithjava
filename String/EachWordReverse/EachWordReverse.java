class EachWordReverse
{
	public static void main(String args[])
	{
		String s1="Java Concept Of The Day";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			StringBuffer sb=new StringBuffer(s2[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}	
	}
}