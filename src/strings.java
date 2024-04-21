public class strings {
    public static void main(String[] args) {
        String greeting = "Hello World";
        System.out.println("The length of string is " + greeting.length());

        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        System.out.println(greeting.indexOf('o'));

        // String Concatenation
        String firstName = "Bhawani";
        String lastName = "Shanker";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        // + operator is used for both concatenation and addition
        // concatenation result of a number and string will be string
        int num = 10;
        String val = "10";
        String z = val + num;
        System.out.println(z);

        String txt = "How are you doing \"Ram\"";
        System.out.println(txt);

        String txt1 = "It\'s a lovely day";
        System.out.println(txt1);

        String txt2 = "It's \\ backslash character";
        System.out.println(txt2);
    }
}
