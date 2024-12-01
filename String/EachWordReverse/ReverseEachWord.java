public class ReverseEachWord
{
    static void reverseEachWordOfString(String String)
    {
        String s1[] = String.split(" "); 
        String reverseString = "";
        for (int i = 0; i < s1.length; i++)
        {
            String s2 = s1[i];
            String s3 = "";
            for (int j = s2.length()-1; j >= 0; j--)
            {
                s3 = s3+ s2.charAt(j);
            }
            reverseString = reverseString + s3+" ";
        }
        System.out.println(reverseString);   
    }
    public static void main(String[] args)
    {
        reverseEachWordOfString("Java Concept Of The Day");
    }
}