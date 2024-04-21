public class typeCasting {
    public static void main(String[] arss) {
        // Widening casting
        // byte -> short -> char -> int -> long -> float -> double
        int myNum = 10;
        double myDouble = myNum;
        System.out.println(myDouble);

        // Narrowing casting
        // double -> float -> long -> int -> char -> short -> byte
        // place the type in parentheses in front of the value
        double myDouble1 = 9.78d;
        int myInt = (int) myDouble1;
        System.out.println(myInt);

    }
}
