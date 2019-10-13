import java.util.Scanner;

public class GreaterNeighbour
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            /*
               0      and    n-1
               first         last
               first to(compare) next      last to(compare) previous one
               1 - 0 and 2
               2 - 1 and 3
               3 - 2 and 4
             */
            boolean eflag=false;
            int l = arr.length-1;
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                   if(arr[i]>arr[i+1])
                   {
                       eflag=false;
                       System.out.print(i+" ");
                   }
                    else if(arr[i]==arr[i+1])
                   {
                        eflag=true;
                   }
                }
                else if(i==l)
                {
                    if(arr[i]>arr[i-1])
                    {
                        eflag=false;
                        System.out.print(i+" ");
                    }
                     else if(arr[i]==arr[i-1])
                    {
                         eflag=true;
                    }
                }
                else
                {
                    if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                    {
                        eflag=false;
                        System.out.print(i+" ");
                    }
                    else if(arr[i]==arr[i-1]&&arr[i]==arr[i+1])
                    {
                         eflag=true;
                    }
                }
            }
            //System.out.print(" The flag is set to : " +eflag);
            if(eflag)
            {
              System.out.print("-1");
            }
            System.out.println();
        }
    }
}
