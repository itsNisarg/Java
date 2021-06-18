public class Init {
    private int x = 9;
    {
        System.out.println("Initialization block Value of x : "+x);
        x=7;
    }
    public Init()
    {
        System.out.println("Constructor block value of x : "+x);
    }
    public static void main(String []args)
    {
        Init i1 = new Init();
        Init i2 = new Init();
    }
}
