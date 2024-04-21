public class array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // access array element
        System.out.println(nums[2]);

        nums[2] = 22;
        System.out.println(nums[2]);

        System.out.println(nums.length);
        // loop through
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // multidimensional array
        int[][] vals = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                System.out.println(vals[i][j]);
            }
        }

        for (int[] row: vals) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}
