import java.util.Scanner;

public class MinHouses
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
            int min = arr[0];
            int loc = 0;
            for(int i=1;i<n;i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                    loc=i;
                }
            }
            System.out.println(loc);
        }
    }
}
