package easy.number_of_steps_to_reduce_a_number_to_zero;

public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        for (int i = num; i > 0; steps++)
            i = (i % 2 == 0) ? i / 2 : i-1;
        return steps;
    }

//    Recursive
//    public int numberOfSteps(int num) {
//        return count(num, 0);
//    }
//    private int count(int num, int steps) {
//        if (num == 0) {
//            return steps;
//        }
//        if (num % 2 == 0) {
//            return count(num / 2, steps + 1);
//        }
//        return count(num - 1, steps + 1);
//    }
}
