package se.ecjava.abdirahmanAli;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        String result = "";
        boolean bool = true;
        while (bool) {
            System.out.println("Enter first nr");
            firstNumber = getDouble(scan);
            viewOperation();
            result = generateOperation(scan);
            System.out.println("Enter second nr");
            secondNumber = getDouble(scan);
            switch (result) {
                case "+":
                    System.out.println(addition(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(subtraction(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(divison(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(multiplication(firstNumber, secondNumber));
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to continue Y/N?");
            String desicion = scan.nextLine();


            if (desicion.contains("Y") || desicion.contains("y")) {
                System.out.println("you choosed yes");
                bool = true;
            }
            if (desicion.contains("N") || desicion.contains("n")) {
                System.out.println("you choosed no");
                System.out.println("bye bye");
                bool = false;
            }


        }

    }

    private static void viewOperation() {
        System.out.println("make your selection:");
        System.out.println("1. + addition");
        System.out.println("2. - subtraction");
        System.out.println("3. / division");
        System.out.println("4. * multiplication");
    }

    private static String generateOperation(Scanner scanner) {
        String operation = "";
        while (true) {
            try {
                operation = getOperation(scanner.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("You cant do that here");
                viewOperation();
            }
        }
        return operation;
    }

    private static String getOperation(String operation) {
        switch (operation) {
            case "+":
                return "+";
            case "-":
                return "-";
            case "*":
                return "*";
            case "/":
                return "/";
            default:
                throw new NumberFormatException("you cant do that");
        }
    }

    private static double getDouble(Scanner scanner) {
        double number = 0;
        while (true)
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("You can't do that ");
                System.out.println("Enter your number again");

            }
        return number;
    }

    public static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double divison(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}











