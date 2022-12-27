// input String s="abcdefghi";
//        output : ghi
//                 def
//                 abc


public class StringPattern
{

  public static void main (String args[])
  {

    String str = "abcdefghijkl";
    int i = str.length () - 1;//8
    int j = str.length () - 3;//6
    float k= str.length()/3;
    for (int a = 0; a < k; a++)
    {
	    for (int b = j; b<=i; b++)
	        {
	            System.out.print(str.charAt(b));
	  }
	i = i - 3;//5,2
	j = j - 3;//3,0

	System.out.println();

      }
  }
}
