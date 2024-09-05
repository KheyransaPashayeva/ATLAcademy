public class searchApp {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] nums = {1, 8, 12, 9, 24, 361, 8, 12, 8, 24, 361, 8, 12, 12, 24, 361, 8, 12, 761, 8, 12, 77, 24, 361, 8, 12, 98, 24, 361, 8, 12, 90, 24, 361, 8, 12, 23, 24, 36, 24, 361, 8, 12, 43, 24, 36};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 43) {
                System.out.println(nums[i]);
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("execution time in milliseconds: " + executionTime);
    }
}
