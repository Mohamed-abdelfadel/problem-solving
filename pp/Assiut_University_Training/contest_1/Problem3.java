import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Character letter = str.charAt(0);
        int ascii = letter.hashCode();
        if (ascii != 122) {
            System.out.println(Character.toChars(ascii + 1));
        } else {
            System.out.println("a");
        }
    }
}
