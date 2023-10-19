import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2,  result;
        char operator;

        System.out.println("Simple Calculator");
        System.out.println("Enter the First Number");
        num1 = scanner.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the Second Number");
        num2 = scanner.nextFloat();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-'   :
                result= num1 - num2 ;
                System.out.println("Result: " +result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " +result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");

        }

        scanner.close();

    }



}

