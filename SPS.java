import java.util.Random;
import java.util.Scanner;

class StonePaperScissor
{
    private final int games;
    private int attempts = 0;
    private int wins = 0;
    Random rand = new Random();
    public StonePaperScissor(int g)
    {
        this.games = g;
    }
    public boolean validate()
    {
        return  this.games>attempts;
    }
    public void working(int n)
    {
        attempts+=1;
        int comp = rand.nextInt(3)+1;
        if (comp == n)
        {
            System.out.println(" There is a TIE !");
        }
        else if(n==1 && comp ==2)
        {
            System.out.println(" Computer chooses Paper. You Lose !");
        }
        else if (n==1)
        {
            System.out.println(" Computer chooses Scissors. You Win !");
            wins+=1;
        }
        else if (n==2 && comp ==3)
        {
            System.out.println(" Computer chooses Stone. You win !");
            wins+=1;
        }
        else if (n==2)
        {
            System.out.println(" Computer chooses Scissors. You Lose !");
        }
        else if (n==3 && comp ==1)
        {
            System.out.println(" Computer chooses Stone. You Lose !");
        }
        else if (n==3)
        {
            System.out.println(" Computer chooses Paper. You Win !");
            wins+=1;
        }
        else
        {
            attempts-=1;
            System.out.println(" Wrong Input ! Try Again !");
        }
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }
}
public class SPS {
    public static void main(String [] args)
    {
        int n;
        System.out.println("\n Welcome to STONE PAPER SCISSOR !");
        System.out.print("\n Enter the number of games : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        StonePaperScissor g1 = new StonePaperScissor(n);
        while(g1.validate())
        {
            System.out.println("\n Enter 1 for Stone \n Enter 2 for Paper \n Enter 3 for Scissors.");
            System.out.print(" Choice : ");
            n = sc.nextInt();
            g1.working(n);
        }

        System.out.println("\n Thanks For Playing !");
        System.out.println(" You won "+g1.getWins()+" out of "+g1.getGames()+" games.");
    }
}
