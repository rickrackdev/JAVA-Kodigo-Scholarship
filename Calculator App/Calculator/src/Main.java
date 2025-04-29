import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1;
        double number2 = 0;
        double result;
        int selection;
        boolean validSelection = true;
        boolean validNumber = true;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Select an option:");
            System.out.println("1. Addition   ||  2. Subtraction   ||  3. Multiplication");
            System.out.println("4. Division   ||  5. Power   ||  6. Square Root");
            selection = Integer.parseInt(userInput.nextLine());
            if (selection <=0 || selection > 6) {
                System.out.println("Invalid option");
                validSelection = false;
            } else {
                validSelection = true;
            }
        }while (!validSelection);

        System.out.println("Enter the first number");
        number1 = Double.parseDouble(userInput.nextLine());
        if (selection != 6) {
            System.out.println("Enter the second number");
            number2 = Double.parseDouble(userInput.nextLine());
        }

        switch (selection) {
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
               result =  Math.sqrt(number1);
               System.out.println("The total is: " + result);
               break;
        }
    }
}
