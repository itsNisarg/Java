import java.sql.SQLOutput;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        String s= sc.next();
        sc.nextLine();
        System.out.print("Name : ");
        String s1= sc.nextLine();
        //sc.nextLine();
        System.out.print("Enter a value : ");
        System.out.println(sc.hasNextInt());
        sc.close();
        System.out.println(s);
        System.out.println(s1);
    }
}
