package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char letter = string.charAt(0);
        int hash = Character.hashCode(letter);
        if (hash >= 97) {
            System.out.println(Character.toChars(hash - 32));
        } else {
            System.out.println(Character.toChars(hash + 32));

        }
    }
}
