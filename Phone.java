class CellPhone
{
    public void ring()
    {
        System.out.println("ringing");
    }
    public void vibrate()
    {
        System.out.println("vibrating");
    }
}
public class Phone {
    public static void main(String [] args)
    {
        CellPhone c=new CellPhone();
        c.ring();
        c.vibrate();
    }
}
