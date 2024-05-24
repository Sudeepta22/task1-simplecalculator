import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        switch(operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}