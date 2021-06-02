import java.util.Scanner;
public class Greater {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int x = sc.nextInt();
        if(13>x)
        {
            System.out.println(" 13 is greater than "+x);
        }
        else
        {
            System.out.println(" 13 is smaller than or equal to "+x);
        }
    }
}
