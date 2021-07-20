public class CompilerCatch {
    public static void main(String [] args)
    {
        int bal = 8000;
        int wa = 13000;

        if(bal<wa)
            throw new ArithmeticException("Funds insufficient");
        bal = bal - wa;

        System.out.println("Transaction successful!");
        System.out.println("Thank You!");
    }
}
