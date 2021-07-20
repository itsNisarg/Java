abstract class Person1
{
    int age;
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(int age,String name)
    {
        setAge(age);
        setName(name);
    }

    abstract void display();
}

class Student1 extends Person1
{
    int roll=59;

    @Override
    void display() {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Roll No = "+roll);
    }
}

class Teacher1 extends Person1
{
    int salary=56000;

    @Override
    void display() {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        s1.setData(18,"Nisarg");
        s1.display();
        Teacher1 t1 = new Teacher1();
        t1.setData(39,"Sunanda");
        t1.display();
    }
}
