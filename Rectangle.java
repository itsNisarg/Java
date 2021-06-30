class RectangleAttributes
{
    private int len=0;
    private int width=0;
    RectangleAttributes()
    {}
    RectangleAttributes(int x)
    {
        len = width = x;
    }

    RectangleAttributes(int length,int breadth)
    {
        len = length;
        width = breadth;
    }

    public int getLen() {
        return len;
    }

    public int getWidth() {
        return width;
    }
}
public class Rectangle {
    public static void main(String [] args)
    {
        RectangleAttributes r1 = new RectangleAttributes(13,12);

        System.out.println(" Length = "+r1.getLen());
        System.out.println(" Width = "+r1.getWidth());
    }
}
