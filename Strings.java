public class Strings {
    public static void main(String[] args)
    {
        String s1 = "computer";                     // s1 is a reference to string object computer
        String s2 = "computer";                     // s2 is reference to the same object that s1 is of
        String s3 = new String("computer");  // s3 is allocated separate memory is distinct from s1 and s2
        System.out.println(s1==s2);                 // == compares the reference values only
        System.out.println(s1.equals(s2));          // .equals compares the actual string
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String n1 = new String("nisarg");
        System.out.println(n1);
        String n2;
        n2 = n1.toUpperCase();
        System.out.println(n2);
        System.out.println(n1);

        String q1 = "Amee";
        String q2 = "amee";
        System.out.println(q1.compareTo(q2));

    }
}
