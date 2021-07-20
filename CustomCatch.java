public class CustomCatch {
    public static void main(String [] args)
    {
        int bal = 8000;
        int wa = 13000;
        try
        {
            if(bal<wa)
                throw new ArithmeticException("Funds insufficient");
            bal = bal - wa;
            System.out.println("Transaction successful!");
        }

        catch (ArithmeticException e)
        {
            System.out.println("Exception : "+e.getMessage());
        }

        System.out.println("Thank You!");
    }
}
