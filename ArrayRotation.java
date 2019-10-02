import java.util.Scanner;

public class ArrayRotation
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n = s.nextInt();
            int shift = s.nextInt();
            int[] arr = new int[n];
            int[] rarr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int k = i+shift;
                if(k>(arr.length-1))
                {
                    rarr[k-(arr.length-1)-1] = arr[i];
                }
                else {
                    rarr[k] = arr[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(rarr[i]+" ");
            }
            System.out.println();
        }
    }
}
