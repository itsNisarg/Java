import java.util.*;
public class Percentage {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter marks in sub 1 : ");
        int x=sc.nextInt();
        System.out.print(" Enter marks in sub 2 : ");
        int y=sc.nextInt();
        System.out.print(" Enter marks in sub 3 : ");
        int z=sc.nextInt();
        System.out.print(" Percentage : ");
        System.out.println((float)(x+y+z)/3);
    }
}
