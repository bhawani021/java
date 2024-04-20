public class variables {
    /*
    * String
    * int
    * float
    * boolean
    * char
    * */

    public static void main(String[] ars) {
        //  String variable
        String name = "Ram";
        System.out.println(name);

        // int variable
        // create an variable and assign value
        int num = 10;
        System.out.println(num);

        // declare an variable
        int num1;
        // assign value to variable
        num1 = 20;
        System.out.println(num1);

        // declare and assign value to a variable
        int num2 = 20;
        // change value
        num2 = 30;
        System.out.println(num2);

        // Final variable
        // overwrite is not allowed
        //final int num3 = 40;
        //num3 = 50; // can't assign a value to final variable num3

        // other types
        float myFloat = 5.99f;
        char myChar = 'F';
        boolean myBool = true;
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBool);

        // display variable
        String username = "John";
        System.out.println("Hello " + username);

        // add one variable to another
        String firstName = "Bhawani ";
        String lastName = "Shanker";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // + character works as mathematical operator
        int x = 5;
        int y = 10;
        System.out.println(x + y);

        // declare multiple variables
        int a = 5, b = 10, c = 20;
        System.out.println(a + b + c);

        // declare multiple variables
        int p, q, r;
        p = q = r = 30;
        System.out.println(p + q + r);





    }
}
