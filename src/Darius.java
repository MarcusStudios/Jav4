import java.util.Scanner;
public class Darius {
    public static void main(String[] args) {
        String nome;
        String passiva;
        int habilidades;
        String arma;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do herói: ");
        nome = input.nextLine();

        System.out.println("Digite a passiva do herói: ");
        passiva = input.nextLine();

        System.out.println("Digite o numero de habilidades do herói: ");
        habilidades = input.nextInt();
        input.nextLine();

        System.out.println("Digite a arma do herói: ");
        arma = input.nextLine();

        
        System.out.println("O nome do herói é: " + nome);
        System.out.println("A passiva do herói é: " + passiva);
        System.out.println("O numero de habilidades do herói é: " + habilidades);
        System.out.println("A arma do herói é: " + arma);

        input.close();



    }
}
