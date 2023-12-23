package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long result = (a*b)-(c*d);
        System.out.println("Difference = " + result);
    }
}