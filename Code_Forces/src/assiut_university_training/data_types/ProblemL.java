package assiut_university_training.data_types;

import java.util.Objects;
import java.util.Scanner;

public class ProblemL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String secondName = scanner.next();
        String firstName2 = scanner.next();
        String secondName2 = scanner.next();

        if (Objects.equals(secondName, secondName2)){
            System.out.println("ARE Brothers");
        }
        else {
            System.out.println("NOT");
        }
    }
}
