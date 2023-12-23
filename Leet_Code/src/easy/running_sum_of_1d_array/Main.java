package org.problemsolving.easy.running_sum_of_1d_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
