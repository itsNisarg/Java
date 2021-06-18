class Persons
{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Students extends Persons
{
    private int roll;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
}
public class Inherit {
    public static void main(String []args)
    {
        Students s1 = new Students();
        s1.setRoll(45);
        s1.setName("Nisarg Suthar");
        s1.setAge(18);

        System.out.println("Name    : "+s1.getName());
        System.out.println("Roll No : "+s1.getRoll());
        System.out.println("Age     : "+s1.getAge());
    }
}
