import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstInput = Integer.parseInt(reader.readLine());
        double secondInput = Double.parseDouble(reader.readLine());
        String thirdInput = reader.readLine();
        System.out.println("String: " + thirdInput);
        System.out.println("Double: " + secondInput);
        System.out.println("Int: " + firstInput);
    }
}
