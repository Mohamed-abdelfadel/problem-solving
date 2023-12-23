package assiut_university_training.data_types;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int pow1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int pow2 = scanner.nextInt();

        if (num1 == num2) {
            if (pow1 > pow2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        if (pow1 == pow2) {
            if (num1 > num2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        if (pow1 < pow2) {
            int result = pow1 % pow2;
            double fnum = Math.pow(num1, pow1 / result);
            double snum = Math.pow(num2, pow2 / result);
            if (fnum > snum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        if (pow1 > pow2) {
            int result = pow2 % pow1;
            double fnum = Math.pow(num1, pow1 / result);
            double snum = Math.pow(num2, pow2 / result);
            if (fnum > snum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
