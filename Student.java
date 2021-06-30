import java.util.Scanner;

class Marks
{
    int[] marks = new int[3];
    Scanner sc = new Scanner(System.in);
    public void getMarks()
    {
        System.out.println("Enter the marks of student : ");
        for (int i = 0; i < 3; i++){
            System.out.print((i+1)+" : ");
            marks[i] = sc.nextInt();
        }
    }
    public String passFail()
    {
        int total=0;
        for(int x : marks)
        {
            total=total+x;
            if(x<33)
                return "Fail";
        }
        if(total / 3 < 40) {
            return "Fail";
        }
        return "Pass";
    }
}

public class Student {
    public static void main(String[] args)
    {
        Marks m1 = new Marks();
        m1.getMarks();
        System.out.println("The student is : "+m1.passFail());
    }
}