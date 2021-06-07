class Employee {
    int fee;
    String name;

    public void setFee(int fee){
        this.fee=fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public String getName() {
        return name;
    }
}

public class Method
{
    public static void main(String []args)
    {
        Employee e1=new Employee();
        e1.setFee(500);
        System.out.println(e1.getFee());
        e1.setName("Nisarg Suthar");
        System.out.println(e1.getName());
    }
}