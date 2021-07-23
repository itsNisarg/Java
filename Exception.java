public class Exception {
    public static void main(String [] args)
    {
        int a=5;
        int b=0;
        System.out.println("Before Try");
        try {
            int ans = a/b;
            System.out.println("In try");
        }

        catch (NullPointerException n)
        {
            System.out.println("Exception "+n.getMessage());
            System.out.println("Not divisible by zero!");
        }
        catch (ArithmeticException d)
        {
            System.out.println("Exception "+d.getMessage());
            System.out.println("Not divisible by zero!");
        }
        System.out.println("Outside Try");
    }
}
