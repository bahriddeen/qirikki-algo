package array;

public class rotateSolution {
    public static void main(String[] args) {
    }
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private void reverse(int[] nums, int k, int i) {
        while (k < i) {
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            k++;
            i--;
        }
    }
}
