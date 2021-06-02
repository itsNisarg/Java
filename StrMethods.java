public class StrMethods {
    public static void main(String[] args)
    {
        String str="Nisarg Suthar";
        System.out.println(str);

        /* using .length() function to find length of the string */

        System.out.println(str.length());
        int x=str.length();
        System.out.println(x);

        /* using .toLowerCase() and .toUpperCase to change the case of letters in string */

        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        /* using .trim() to remove excess white space from the string */

        String str1="    Suthar Nisarg         ";
        System.out.println(str1);
        System.out.println(str1.trim());

        /* using .substring() to get sub-strings from the string */
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,8));

        /* using .replace() to replace a char */
        System.out.println(str.replace('g','j'));

        /* using .startsWith() to check if string starts with something */
        String name="Bharat";
        System.out.println(name);
        System.out.println(name.startsWith("Ba"));
        System.out.println(name.startsWith("Bha"));

        /* using .endsWith() to check if string ends with something */
        System.out.println(name.endsWith("at"));
        System.out.println(name.endsWith("Ta"));

        /* using .charAt() and .indexOf methods to know about characters in string */
        System.out.println(name.charAt(3));
        /* System.out.println(name.charAt(7));   Array index out of bounds */
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf('n')); /* returns -1 if specified character is not in the string */
        System.out.println(name.indexOf('a',6)); /* returns -1 if not found after specified index */
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('n')); /* returns -1 if character does not exist in the string */

        /* comparing two strings */
        System.out.println(name.equals("Bharat"));
        System.out.println(name.equals("bharat"));
        System.out.println(name.equalsIgnoreCase("bharat"));
    }
}
