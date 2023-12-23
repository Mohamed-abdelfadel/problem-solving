package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int firstNumber = Character.getNumericValue(c);
        if (firstNumber%2==0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

    }
}
