import java.util.Scanner;

public class PlayingCards
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++)
        {
           String card1 = s.next();
           String[] cards = new String[5];
           for(int j=0;j<cards.length;j++)
           {
               cards[i] = s.next();
           }
           boolean isCard1 = false;
           for(int j=0;j<cards.length;j++)
           {
               if(card1.charAt(0)==cards[i].charAt(0))
               {
                   isCard1 = true;
                   break;
               }
           }
           boolean isCard2 = false;
            for(int j=0;j<cards.length;j++)
            {
                if(card1.charAt(1)==cards[i].charAt(1))
                {
                    isCard2 = true;
                    break;
                }
            }
            if(isCard1||isCard2)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
