import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        //comments are done with a double slash single line comments
        /*
        block comments are done like this, forward slash and an asterisks
         */
        //variable declaration
        int number = 10;
        float decimal = 3.5f;
        double douDecimal = 3.5;

        String myName = "Ricardo Alvarenga";
        String myAge = "26";
        boolean isEleven =   myAge.equals("11");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to the JD-20 Bootcamp");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + " is nice to meet you!");

        //if - else - else if

        System.out.println("Hey, what type of data are you entering? \n 1.Number \n 2.String");
        Scanner scanner1 = new Scanner(System.in);
        int data = scanner1.nextInt();

        if (data == 1){
            System.out.println("Give me your number");
            int num1 = scanner1.nextInt();
            System.out.println("Your number is: " + num1);
        }


    }
}
