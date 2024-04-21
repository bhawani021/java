public class methodOvrloading {
    public static void main(String[] args) {
        int num1 = add(10, 20);
        double num2 = add(10.0, 20.1);

        System.out.println("int ->" + num1);
        System.out.println("double ->" + num2);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }
}
