import java.util.Scanner;

class Person
{
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTax()
    {
        int temp=salary;
        double it=0;
        if(temp>1000000)
        {
            temp-=1000000;
            it = 112500.0;
            it += temp*0.3;
        }
        else if (temp>500000)
        {
            temp-=500000;
            it = 12500.0;
            it += temp*0.2;
        }
        else if (temp>250000)
        {
            temp-=250000;
            it += temp*0.05;
        }
        else
        {
            it=0;
        }
            return it;
    }
}
public class Income {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Your Salary : Rs. ");
        p1.setSalary(sc.nextInt());
        System.out.println("\n Income Tax : Rs. "+p1.getTax());
    }
}
