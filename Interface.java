interface Bicycle
{
    int x = 5;
    void applyBrakes(int decrease);
    void accelerate(int increase);
}

class Avon implements Bicycle
{
    int speed = 8;

    @Override
    public void accelerate(int increase) {
        speed += increase;
        //x = 3;            x is by default a final variable and cannot be assigned a new value
    }

    @Override
    public void applyBrakes(int decrease) {
        speed -= decrease;
    }

    void blowHorn()
    {
        //noinspection SpellCheckingInspection
        System.out.println("Peepepeepepepep!");
    }
}

public class Interface {
    public static void main(String[] args)
    {
        Avon a1 = new Avon();
        a1.applyBrakes(5);
        System.out.println("Interface variable x = "+Bicycle.x);
        System.out.println("Interface variable x = "+a1.x);
        a1.blowHorn();
        a1.accelerate(10);
        //a1.x += 5;            x is by default a final variable and cannot be assigned a new value
        //Bicycle.x += 10;      x is by default a final variable and cannot be assigned a new value
    }
}
