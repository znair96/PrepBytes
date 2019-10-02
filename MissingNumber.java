import java.util.Scanner;

public class MissingNumber
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       for(int j=1;j<=t;j++)
       {
           int n = s.nextInt();
           int[] arr = new int[n];
           int sum=0;
           for(int i=0;i<arr.length;i++)
           {
               arr[i] = i+1;
               sum = sum+arr[i];
           }
           int[] uarray = new int[n-1];
           for(int i=0;i<uarray.length;i++)
           {
               uarray[i] = s.nextInt();
           }
           int missingSum  = 0;
           for(int i=0;i<uarray.length;i++)
           {
               missingSum = missingSum + uarray[i];
           }
           int missing = sum - missingSum;
           System.out.println(missing);

       }
    }
}
