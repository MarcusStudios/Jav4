import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double num1;
        double num2;
        double result;

        String operator;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the operator: ");
        operator = input.next();

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator) { 
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break; 
            case "*":
                result = num1 * num2;    
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}