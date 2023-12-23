import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a value: ");
            String input = reader.readLine();

            System.out.println("Input value: " + input);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}