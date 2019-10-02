import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            int sum=0;
            //Inputing the array
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            //Outputting the array
            for(int i=0;i<n;i++)
            {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
