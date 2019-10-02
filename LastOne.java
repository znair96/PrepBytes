import java.util.Scanner;

public class LastOne
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int oneloc = -1;
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==1)
                {
                    oneloc = i;
                }
            }
            if(oneloc==-1)
            {
                System.out.println(oneloc);
            }
            else
            {
                System.out.println(oneloc);
            }
        }
    }
}
