import java.util.*;
class CalculateMean
{
	public static void main(String...g)
	{
		double mean=0.0;
		int scores[]=new int[]{13,18,13,14,13,16,14,21,13};
		Arrays.sort(scores);
		//System.out.println("sorted Scores");
		for(int x:scores)
		{
			System.out.println(x+"");
		}
		for(double n:scores)
	    {
		   mean=mean+n;
	    }
	    mean=mean/scores.length;
	    System.out.println();
	    System.out.println("mean="+mean);
	}	
}