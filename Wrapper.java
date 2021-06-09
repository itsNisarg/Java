public class Wrapper {
    public static void main(String[] args)
    {
        // Use of wrapper classes Integer and Double
        // Use of function valueof() to convert string to wrapper class object
        //  Also there are other functions like Integer() and .intValue() to convert into and from wrapper class objects
        Integer i1=Integer.valueOf("123");
        Double d1 = Double.valueOf("1.23");
        Integer i2 = Integer.valueOf("100101",2);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(i2);

        // Use of .parseWrapper() to convert string to primitive data type.
        int i = Integer.parseInt("1234");
        double d = Double.parseDouble("12.422");
        System.out.println(i);
        System.out.println(d);
    }
}
