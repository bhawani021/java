public class datatype {
    public static void main(String[] args) {
        // variables
            // int
            // float
            // char
            // boolean
            // String

        // a variable in JAVA must be a specified data type

        // primitive data type
            // byte - 1 byte - -128 to 127
            // short - 2 bytes - 32,768 to 32, 767
            // int - 4 bytes
            // long - 8 bytes
            // float - 4 bytes
            // double - 8 bytes
            // boolean - 1 byte
            // char - 2 bytes
        // non-primitive data type
            // String
            // Arrays
            // Classes

        // Numbers
        // Primitive numbers are divided into two groups
        // 1. Integer {byte, short, int, long}

        byte num1 = 10;
        System.out.println(num1);

        short num2 = 5000;
        System.out.println(num2);

        int num3 = 100000;
        System.out.println(num3);

        long num4 = 15000000000L;
        System.out.println(num4);

        // 2. Float {float, double}
        float num5 = 5.75f;
        System.out.println(num5);

        // boolean
        boolean isMonday = false;
        System.out.println(isMonday);

        // Characters
        char myGrade = 'A';
        System.out.println(myGrade);

        // ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1 + "||" +myVar2 + "||" + myVar3);

        // non-primitive data types are called reference types because they refer to an object
    }
}
