package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();
        System.out.println((number*(number+1))/2);
    }
}
