import java.util.Scanner;

public class Arrays {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 5 numbers : ");
        int [] arr = new int[5];
        for (int i = 0; i<5; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" Displaying the entered numbers : ");
        System.out.println(arr[0]);
        for (int i = 1; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
