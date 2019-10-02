import java.util.Scanner;

public class FindOddAndEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Even Elements = ");
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           {
               System.out.print(arr[i]+" ");
           }
        }
        System.out.println();
        System.out.print("Odd Elements = ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
