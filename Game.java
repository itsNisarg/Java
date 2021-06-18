import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String []args)
    {
        System.out.println("\n THE GAME OF GUESSING !");
        int num;
        int success = 0;
        Working guess = new Working();
        Scanner sc = new Scanner(System.in);
        while(guess.valid())
        {
            System.out.print("\n Enter a number: ");
            num = sc.nextInt();
            guess.check(num);
            success = success +1;
        }
        if(success==5)
            System.out.println("\n SHOOT !");
        System.out.println("\n The number was "+guess.getNumber());
        System.out.println("\n Thanks For Playing !");
    }
}

class Working
{
    private final int number;
    private  int attempts;
    static int noOfGuesses;
    Working()
    {
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println("\n The computer has guessed a number !");
        noOfGuesses = 5;
        attempts = 0;
    }
    boolean valid()
    {
        return attempts < noOfGuesses;
    }
    void check(int guess)
    {
        attempts = attempts + 1;
        if (guess == number) {
            System.out.println(" Congratulations You Guessed It !");
            attempts = noOfGuesses;
        } else if (guess < number) {
            System.out.println(" Take it up a notch.");
        } else {
            System.out.println(" Little lower.....");
        }
    }
    int getNumber()
    {
        return number;
    }
}