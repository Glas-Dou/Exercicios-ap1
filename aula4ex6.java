import java.util.Scanner;
public class aula4ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        String produto = "";
        double preco = 0;

        switch (codigo) {
            case 100:
                produto = "Cachorro Quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
        }

        double total = preco * qtd;

        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Valor a pagar: R$ %.2f%n", total);



    }
}