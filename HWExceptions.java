import java.util.Scanner;

public class HWExceptions {
    public static void main(String [] args) throws ArithmeticException
    {
        //System.ot.println("Hello ! There is a syntax error in writing out");       Example of Syntax Error

        System.out.println("The remainder when 7 is divided by 3 is "+remainder(7,3));

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        a=sc.nextInt();
        System.out.print("Enter b ");
        b=sc.nextInt();

        try {
            System.out.println("The remainder when  a is divided by b is "+remainder(a,b));
            //run-time error if b=0
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero not possible !");
        }
        System.out.println("End of program.");
    }

    static int remainder(int a, int b)
    {
        return a/b;                 //logical error by returning quotient instead of remainder
    }
}
