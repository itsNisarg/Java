import java.util.Scanner;

class Person
{
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTax()
    {
        if(salary>1000000)
        {
            return salary*0.3;
        }
        else if (salary>500000)
        {
            return salary*0.2;
        }
        else if (salary>250000)
        {
            return salary*0.05;
        }
        else
            return 0;
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
