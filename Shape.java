import java.util.Scanner;

class Square
{
    int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getPerimeter()
    {
        return this.side*4;
    }

    public int getArea()
    {
        return this.side*this.side;
    }
}
public class Shape {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Square s = new Square();
        System.out.print("Enter the side of square : ");
        int i = sc.nextInt();
        s.setSide(i);
        System.out.println("Perimeter of the square : "+s.getPerimeter());
        System.out.println("Area of the square : "+s.getArea());
    }
}
