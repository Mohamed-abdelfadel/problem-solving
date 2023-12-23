package assiut_university_training.contest_1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result = scanner.nextInt();
        if ((num1 + num2 * num3 == result) || (num1 * num2 + num3 == result) || (num1 - num2 + num3 == result) || (num1 + num2 - num3 == result) || (num1 - num2 * num3 == result) ||( num1 * num2 - num3 == result)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
