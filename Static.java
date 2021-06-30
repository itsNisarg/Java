class Parent
{
    public static void f1()
    {
        System.out.println("PArent");
    }
}

class Child extends Parent
{
    public static void f1()
    {
        System.out.println("Child");
    }
}

public class Static {
    public static void main(String [] args)
    {
        Parent.f1();
    }
}
