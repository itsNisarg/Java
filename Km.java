import java.util.Scanner;
public class Km {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter distance in km : ");
        float km=sc.nextFloat();
        System.out.println(" Distance in meters : "+km*1000+"km");
    }
}
