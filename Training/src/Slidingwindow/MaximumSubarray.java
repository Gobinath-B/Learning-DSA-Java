package Slidingwindow;

public class MaximumSubarray {


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
        public static int maxSubArray(int[] nums) {
            int sum = nums[0]; // Initialize sum with the first element
            int result = nums[0]; // Initialize result with the first element

            for (int i = 1; i < nums.length; i++) {
                sum = Math.max(nums[i], sum + nums[i]); // Update sum
                result = Math.max(result, sum); // Update result
            }

            return result;
        }

}
