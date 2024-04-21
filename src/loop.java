public class loop {
    public static void main(String[] args) {
        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // do while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);

        // for each loop
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
