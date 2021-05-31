import java.util.Scanner;
public class Add {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter first element : ");
        int x=sc.nextInt();
        System.out.print(" Enter second element : ");
        int y=sc.nextInt();
        System.out.print(" Enter third element : ");
        int z=sc.nextInt();
        System.out.print(" Sum of 3 numbers : ");
        System.out.println(x+y+z);
    }
}
