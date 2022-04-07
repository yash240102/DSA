/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static int sumarray (int arr[], int n)
  {
    if (n <= 0)
      {
	return 0;

      }
    return sumarray (arr, n - 1) + arr[n - 1];
  }
  public static void main (String[]args)
  {
    int arr[] = { 1, 2, 3, 4, 5 };
    int sum = 0;
    sum = sumarray (arr, arr.length);
    System.out.println (sum);

  }
}
