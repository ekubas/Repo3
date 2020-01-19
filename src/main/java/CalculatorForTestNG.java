import java.util.Scanner;

public class CalculatorForTestNG {

    public double calculator(int firstNumber, int secondNumber, String operation) {

        switch (operation) {
            case "add":
                return addOperation(firstNumber, secondNumber);
            case "sub":
                return subOperation(firstNumber, secondNumber);

            case "multi":
                return multiOperation(firstNumber, secondNumber);

            case "div":
                return divOperation(firstNumber, secondNumber);
            default:
                System.out.println("Incorrect operation type provided");
                return 0;
        }
    }

    public static int addOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiOperation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divOperation(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number to be calculated");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number to be calculated");
        int secondNumber = scanner.nextInt();
        System.out.println("Type operation: add, sub, multi or div.");
        String operation = scanner.next();

        CalculatorForTestNG calculatorForTestNG = new CalculatorForTestNG();
        System.out.println(calculatorForTestNG.calculator(firstNumber, secondNumber, operation));
    }


}
