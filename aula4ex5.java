import java.util.Scanner;
public class aula4ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Escolha a operação (M, S, P, D): ");
        char opcao = sc.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'M':
                System.out.println("Média: " + ((num1 + num2) / 2));
                break;
            case 'S':
                System.out.println("Diferença: " + Math.abs(num1 - num2));
                break;
            case 'P':
                System.out.println("Produto: " + (num1 * num2));
                break;
            case 'D':
                if (num2 != 0) {
                    System.out.println("Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}