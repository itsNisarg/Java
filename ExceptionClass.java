class InvalidException extends ArithmeticException
{
    public String toString()
    {
        return "Exception Occurs !";
    }
}

class CanNotDivide extends ArithmeticException
{
    public String toString()
    {
        return "divided by zero";
    }
}

class CustomCalc
{
    public double add(double a, int b)
    {
        if(a==9)
        {
            throw new InvalidException();
        }
        return a+b;
    }
    public double sub(double a, int b)
    {
        return a-b;
    }
    public double mul(double a, int b)
    {
        return a*b;
    }
    public double div(double a, int b)
    {
        if(b==0)
        {

            throw new CanNotDivide();
        }
        return a/b;
    }
    public double rem(double a, int b)
    {
        return a%b;
    }
}

public class ExceptionClass {
    public static void main(String [] args)
    {
        CustomCalc cal = new CustomCalc();
        cal.div(9,0);
    }
}
