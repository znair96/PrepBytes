import java.util.Scanner;

public class HardCoderProblem {
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
            int flag=0; //easy
            //flag=1 hard
            for(int i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("easy");
            }
            else {
                System.out.println("hard");
            }
            System.out.println();
        }
    }
}
