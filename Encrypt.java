import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a character : ");
        char grade=sc.next().charAt(0);
        grade = (char) (grade + 8);
        System.out.println(" Encrypted grade : "+grade);
        System.out.print(" Decrypted grade : "+(char)(grade-8));
    }
}
