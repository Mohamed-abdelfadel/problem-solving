import java.util.Scanner;

public class ProblemM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char letter = string.charAt(0);

        if (Character.hashCode(letter) >= 48 && Character.hashCode(letter) < 65  ){
            System.out.println("IS DIGIT");
        }
        else {
            if (Character.hashCode(letter)>= 97){
                System.out.println("ALPHA\n" + "IS SMALL");
            }
            else {
                System.out.println("ALPHA\n" +
                        "IS CAPITAL");
            }
        }
    }
}
