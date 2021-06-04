class Box
{
    private int length,width,height;
    public
    void setDimension(int l,int w,int h)
    {
        length=l;
        width=w;
        height=h;
    }
    void showDimension()
    {
        System.out.println("length : "+length);
        System.out.println("height : "+height);
        System.out.println("width : "+width);
    }
}
public class Classes {
    public static void main(String[] args)
    {
        Box smallBox=new Box();
        smallBox.setDimension(1,2,3);
        smallBox.showDimension();
        smallBox=new Box();
        smallBox.showDimension();
    }
}
