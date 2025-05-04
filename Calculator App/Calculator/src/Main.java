import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaring variables
        double number1;
        double number2 = 0;
        double result;
        double selection;
        boolean validSelection = true;
        boolean newCalc = false;
        Scanner userInput = new Scanner(System.in);

        do {
            //loop for choice selection, if not a valid choice loops it until a valid one is made.
            do {
                System.out.println("Select an option:");
                System.out.println("1. Addition   ||  2. Subtraction   ||  3. Multiplication");
                System.out.println("4. Division   ||  5. Power   ||  6. Square Root");
                selection = InputValidator.isNumber(userInput, userInput.nextLine());
                if (selection <= 0 || selection > 6) {
                    System.out.println("Invalid option");
                    validSelection = false;
                } else {
                    validSelection = true;
                }
            } while (!validSelection);

            //asking for user input, if input is equal to 6 skips asking for the second number
            System.out.println("Enter the first number");
            number1 = InputValidator.isNumber(userInput, userInput.nextLine());
            if (selection != 6) {
                System.out.println("Enter the second number");
                number2 = InputValidator.isNumber(userInput, userInput.nextLine());
            }

            //switch for the math operations based on user input.
            switch ((int) selection) {
                case 1:
                    result = number1 + number2;
                    System.out.println("The total is: " + result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.println("The total is: " + result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("The total is: " + result);
                    break;
                case 4:
                    if (number2 == 0) {
                        System.out.println("There's no division by zero");
                    } else {
                        result = number1 / number2;
                        System.out.println("The total is: " + result);
                    }
                    break;
                case 5:
                    result = Math.pow(number1, number2);
                    System.out.println("The total is: " + result);
                    break;
                case 6:
                    result = Math.sqrt(number1);
                    System.out.println("The total is: " + result);
                    break;
            }

            //ask user input to continue doing calculations or not.
            System.out.println("Do you want to continue? (Y/N)");
            if (userInput.nextLine().equalsIgnoreCase("y")) {
                newCalc = true;
            }else {
                newCalc = false;
            }
        } while (newCalc);
    }

}



