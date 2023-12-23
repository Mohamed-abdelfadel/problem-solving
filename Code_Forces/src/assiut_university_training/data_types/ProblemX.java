package assiut_university_training.data_types;

import java.util.Scanner;
public class ProblemX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num11 = scanner.nextInt();
        int num12 = scanner.nextInt();
        int num21 = scanner.nextInt();
        int num22 = scanner.nextInt();
        if (num11 <= num21 && num12 > num22) {
            System.out.println(num21 + " " + num22);
        } else if (num12 <= num22 && num11 <= num21 && num21 <= num12) {
            System.out.println(num21 + " " + num12);
        } else if (num11 > num21 && num12 <= num22) {
            System.out.println(num11 + " " + num12);
        } else if (num11 > num21 && num12 > num21 && num11 < num22) {
            System.out.println(num11 + " " + num22);
        } else {
            System.out.println(-1);

        }
    }
}
