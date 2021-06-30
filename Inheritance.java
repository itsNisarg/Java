class Base
{
    protected int x;
    Base()
    {
        System.out.println(" Base class constructor");
    }
    Base(int a)
    {
        System.out.println(" Overloaded constructor");
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base
{
    protected int y;
    Derived()
    {
        super(0);
        System.out.println(" Derived class constructor");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class Inheritance {
    public static void main(String []args)
    {
        Derived d = new Derived();
    }
}
