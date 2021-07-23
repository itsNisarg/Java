class MaxInput extends java.lang.Exception
{
    public String toString()
    {
        return "Hello!";
    }
}
class Calc
{
    public double add(double a,double b) throws MaxInput
    {
        if(a>100)
        {
            throw  new MaxInput();
        }
        return  a+b;
    }
}
public class ClassException {
    public static void main(String [] args) throws MaxInput
    {
        Calc c = new Calc();
        c.add(1000,4);
    }
}
