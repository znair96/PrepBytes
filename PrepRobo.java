import java.util.Scanner;

public class PrepRobo {
    public static int maxNum(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minNum(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean returnFound(int num,int[] arr)
    {
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==num) {
              return true;
          }
      }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int num = s.nextInt();
            int rnum = num;
            int nummOfDigits=0;
            while(num!=0)
            {
                num = num/10;
                nummOfDigits++;
            }
            int[] arr = new int[nummOfDigits];
            for(int i=0;i<nummOfDigits;i++)
            {
                int r = rnum%10;
                rnum = rnum/10;
                arr[i] = r;
            }
            int minnum = minNum(arr);
            int maxnum = maxNum(arr);
            int ordnum = minnum;
            int count=0;
            while(ordnum<=maxnum && ordnum>=minnum)
            {

                if(returnFound(ordnum,arr))
                {
                  count++;
                }
                else
                {
                    break;
                }
                ordnum++;
            }
            if(count==arr.length)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
