public class Sinit {
    private int x;
    private static int y;
    static
    {
        System.out.println("Static init block y = "+y);
        y=9;
    }
    public Sinit()
    {
        System.out.println("Constructor x = "+x);
        System.out.println("Constructor y = "+y);
    }
    public static void main(String[] args)
    {
        Sinit s3 = new Sinit();
        Sinit s4 = new Sinit();
    }
}
