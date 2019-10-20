Pattern Output
     *     
    * *    
   * * *   
  * * * *  
 * * * * * 
* * * * * *


import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
         Scanner s = new Scanner(System.in);
         int row = s.nextInt();
         int  column = 2*row-1;
         int mid = (column+1)/2;
         for(int i=1;i<=row;i++)
         {
             int count=0;
             for(int j=1;j<=column;j++)
             {
                 if(j>=((mid+1)-i)&&j<=((mid-1)+i))
                 {
                     count++;
                     if(count%2!=0)
                     {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
