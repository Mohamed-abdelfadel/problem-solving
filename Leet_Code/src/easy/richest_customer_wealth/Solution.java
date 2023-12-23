package easy.richest_customer_wealth;

import java.util.Arrays;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int sum;
        int num = 0;
        for (int[] balance : accounts) {
            sum = 0;
            for (int bank : balance)
                sum += bank;
            if (num < sum)
                num = sum;
        }
        return num;
    }

//    public int maximumWealth(int[][] accounts) {
//        int maxWealth = 0;
//        for (int[] account : accounts) {
//            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
//        }
//        return maxWealth;
//    }
}
