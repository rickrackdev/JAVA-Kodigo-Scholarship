import java.util.Scanner;

//validates if user input is a numeric value, if not loops and ask until it is.
public class InputValidator {
    public static double isNumber(Scanner scanner, String input) {
        double number;
        while (true) {
            try {
                number = Double.parseDouble(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try a numeric value");
                input = scanner.nextLine();
            }
        }
    }
}
