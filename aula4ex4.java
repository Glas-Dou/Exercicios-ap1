
import java.util.Scanner;
public class aula4ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o plano de trabalho (A, B ou C): ");
        char plano = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: R$ ");
        double salario = sc.nextDouble();

        double novoSalario = salario;

        switch (plano) {
            case 'A':
                novoSalario = salario * 1.10;
                break;
            case 'B':
                novoSalario = salario * 1.15;
                break;
            case 'C':
                novoSalario = salario * 1.20;
                break;
            default:
                System.out.println("Plano inválido!");
        }

        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
    }
}