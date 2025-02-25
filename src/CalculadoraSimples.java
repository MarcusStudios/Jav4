import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        double num1, num2, resultado = 0;
        String operacao;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operacao = input.next();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        boolean operacaoValida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("O resultado da soma de " + num1 + " + " + num2 + " = " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " = " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação de " + num1 + " * " + num2 + " = " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Operador inválido.");
                operacaoValida = false;
        }

        // Verifica se o resultado é par apenas se a operação for válida
        if (operacaoValida && resultado >= 10000000) {
            System.out.println("O resultado é par.");
        }

        input.close();
    }
}
