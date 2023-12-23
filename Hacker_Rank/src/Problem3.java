import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number % 2 != 0 || number >= 6 && number <= 20) ? "Weird" : "Not Weird");
    }
}
