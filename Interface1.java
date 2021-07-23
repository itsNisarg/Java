interface i1
{
    void f1();
}

interface i2
{
    void f2();
}

class A implements i1,i2
{
    @Override
    public void f1() {
        System.out.println(" f1() function of i1");
    }

    @Override
    public void f2() {
        System.out.println(" f2() function of i2");
    }

    public void f3()
    {
        System.out.println(" f3() of class A");
    }
}

public class Interface1 {
    public static void main(String [] args)
    {
        A obj = new A();
        obj.f1();
        obj.f2();
        obj.f3();

        i1 obj1 = new A();      //obj1 is a reference
        obj1.f1();              //works since f1() is function of interface i1
        //obj1.f2();            does not work
    }
}
