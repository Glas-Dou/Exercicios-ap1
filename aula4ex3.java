import java.util.Scanner;

public class aula4ex3 {
    public static void main(String[] args) {
        System.out.println("Me fale seu horario de aula;");
        System.out.println("m - Matutino");
        System.out.println("v - Vespertino");
        System.out.println("n - Noturno");

        Scanner sc = new Scanner(System.in);

        String horario = sc.nextLine();

        switch (horario){
            case "m" :
                System.out.println("Bom dia seu horario de aula e as 8 horas");
                break;
            case "v" :
                System.out.println("Bom tarde seu horario de aula e as 14 horas");
                break;
            case "n" :
                System.out.println("Bom noite seu horario de aula e as 19 horas");
                break;

            default:
                System.out.println("Nao tem esse horario");
        }
    }
}