package array;

public class moveZeroesSolution {
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count += 1;
                continue;
            }
            int temp = nums[i - count];
            nums[i - count] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
