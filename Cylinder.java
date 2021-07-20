package Cylinder;

import java.util.Scanner;

class CylinderProperties
{
    private int rad = 0;
    private int height = 0;

    public CylinderProperties(int r,int h)
    {
        rad = r;
        height = h;
    }

    public CylinderProperties() {

    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRad() {
        return rad;
    }

    public int getHeight() {
        return height;
    }

    public double getV()
    {
        return (3.14) * rad * rad * height;
    }

    public double getCSA()
    {
        return 2 * (3.14) * rad * height;
    }

    public double getTSA()
    {
        return 2 * (3.14) * rad * (height + rad);
    }
}

class SphereProperties
{
    private int rad = 0;

    public SphereProperties(int r)
    {
        rad = r;
    }

    public SphereProperties() {

    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public double getV()
    {
        return 4 * (3.14) * rad * rad * rad / 3;
    }

    public double getTSA()
    {
        return 4 * (3.14) * rad * rad;
    }
}

public class Cylinder {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the radius : ");
        int radius = sc.nextInt();
        System.out.print(" Enter the height : ");
        int hgt = sc.nextInt();
        CylinderProperties c1 = new CylinderProperties(radius,hgt);
        System.out.println(" The Curved Surface Area of Cylinder : "+c1.getCSA());
        System.out.println(" The Total Surface Area of Cylinder : "+c1.getTSA());
        System.out.println(" The Volume of Cylinder : "+c1.getV());

        CylinderProperties c2 = new CylinderProperties();
        System.out.println(" Radius = "+c2.getRad());
        System.out.println(" Height = "+c2.getHeight());
        System.out.print(" Enter the radius : ");
        radius = sc.nextInt();
        System.out.print(" Enter the height : ");
        hgt = sc.nextInt();
        c2.setRad(radius);
        c2.setHeight(hgt);
        System.out.println(" The Curved Surface Area of Cylinder : "+c2.getCSA());
        System.out.println(" The Total Surface Area of Cylinder : "+c2.getTSA());
        System.out.println(" The Volume of Cylinder : "+c2.getV());

        System.out.print(" Enter the radius : ");
        radius = sc.nextInt();
        SphereProperties s1 = new SphereProperties(radius);
        System.out.println(" The Total Surface Area of Sphere : "+s1.getTSA());
        System.out.println(" The Volume of Sphere : "+s1.getV());

        SphereProperties s2 = new SphereProperties();
        System.out.println(" Radius = "+s2.getRad());
        System.out.print(" Enter the radius : ");
        radius = sc.nextInt();
        s2.setRad(radius);
        System.out.println(" The Total Surface Area of Sphere : "+s2.getTSA());
        System.out.println(" The Volume of Sphere : "+s2.getV());
    }
}
