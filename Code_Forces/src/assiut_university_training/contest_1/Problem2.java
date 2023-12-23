package assiut_university_training.contest_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        String m = scanner.next();
        BigInteger memo = new BigInteger(num1);
        BigInteger momo = new BigInteger(num2);
        BigInteger multiplier = new BigInteger(m);
        BigInteger zero = new BigInteger("0");
//        System.out.println(memo);
//        System.out.println(momo);
//        System.out.println(multiplier);

        if (memo.mod(multiplier).equals(momo.mod(multiplier))) {
            System.out.println("Both");
        } else {
            if (memo.mod(multiplier).equals(zero)) {
                System.out.println("Memo");
            } else if  (momo.mod(multiplier).equals(zero)){
                System.out.println("Momo");
            }
            else {
                System.out.println("No One");
            }
        }
    }
}
