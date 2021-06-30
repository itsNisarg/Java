final class  Acc
{
    void MobNumber()
    {
        System.out.println("7016704964");
    }
    final void AtmPin()
    {
        System.out.println("545356");
    }
}

/*class Thief extends Acc           A class declared as final cannot be inherited
{
    void MobNumber()
    {
        System.out.println("684651324");
    }

     void AtmPin()       A final method of base class cannot be over-ridden in child class
     {
         System.out.println("651484");
     }

}
*/
public class Final {
    public static void  main(String [] args)
    {
        final int A=1;
        System.out.println(" Value of A = "+A);
        //A = 21; A final type of variable cannot be assigned a new value
        System.out.println(" Value of A = "+A);
        /*
        Thief t1 = new Thief();
        t1.MobNumber();
        t1.AtmPin();
        */
    }
}
