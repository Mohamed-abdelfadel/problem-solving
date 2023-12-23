package easy.running_sum_of_1d_array;

public class Solution_old {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int starting = 0;
            for (int j = 0; j <= i; j++) {
                starting += nums[j];
            }
            result[i] = starting;
        }
        return result;
    }
}
