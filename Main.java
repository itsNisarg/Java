import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first : ");
        int a = scan.nextInt();
        System.out.print("Enter second : ");
        int b = scan.nextInt();
        int sum=a+b;
        System.out.println("The sum of two numbers is : "+sum);
        scan.close();
    }
}
