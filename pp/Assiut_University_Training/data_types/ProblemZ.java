import java.util.Scanner;

public class ProblemZ {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long num1 = scanner.nextLong();
        long pow1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long pow2 = scanner.nextLong();

        if (Math.log(num1)*pow1 > Math.log(num2)*pow2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
