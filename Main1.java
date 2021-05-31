/*
  @file Main1.java
 * @author Nisarg Suthar(nisargsuthar0@gmail.com)
 * @version 0.1
 * @date 28/05/2021
 * @brief using nextLine to read string with spaces and hasNextInt to check the type of input
 * @copyright Copyright(C) 2021
 */
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
