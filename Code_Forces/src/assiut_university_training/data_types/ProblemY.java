package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int inputLastTwoNumber1 = num1 % 100;
        int inputLastTwoNumber2 = num2 % 100;
        int inputLastTwoNumber3 = num3 % 100;
        int inputLastTwoNumber4 = num4 % 100;
        int lastTwoNumbersInSum = (inputLastTwoNumber1 * inputLastTwoNumber2 * inputLastTwoNumber3 * inputLastTwoNumber4) % 100;
        if (lastTwoNumbersInSum < 10) {
            System.out.println(0 + String.valueOf(lastTwoNumbersInSum));
        } else {
            System.out.println(lastTwoNumbersInSum);
        }
    }
}
