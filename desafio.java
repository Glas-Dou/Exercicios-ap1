import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        System.out.println("==== Golpes financeiros ==== ");
        System.out.println("Iae, já ouviu aquele ditado? \"Todo dias sai de casa um malandro e um otário\"");
        System.out.println("Então não seja o otário");
        System.out.println("Tenho duas listas para ajudar você. Qual você vai querer? [lista 1] ou [lista 2] ");

        Scanner sc = new Scanner(System.in);


        String nome;
        do {
            nome = sc.nextLine();


        switch (nome){
            case "lista 1":
                System.out.println("Essa é a lista 1. Agora digita um número aí pra você ler as dicas, irmão.");
                System.out.println("1. Banco Central no Pique de Bloquear Golpe e Não Deixar os Malandro Passar a Perna");
                System.out.println("2. Dicas gerais para evitar golpes");
                System.out.println("3. Caiu em Golpe no Pix? Se Liga no Que Fazer");
                System.out.println("4. Golpe do “Presente”? Não Cai Nessa, Mano!");
                System.out.println("5. Caiu em Golpe Depois de Fazer TED? Se Liga!");
                System.out.println("6. Comprou com Cartão e Caiu em Golpe? Fica Esperto!");
                System.out.println("7. Pagou Boleto e Caiu em Golpe? Cuidado!");
                System.out.println("8. Banco do Golpista Tá No Zerinho?");
                System.out.println("9. Compra no Cartão que Tu Não Reconhece?");
                System.out.println("Se não quiser mais ver, é só digitar [0]");

                break;

 
            case "lista 2":
                System.out.println("E essa é a lista 2, meio óbvio né?");
                System.out.println("10. Compra na Maquininha que Tu Não Reconhece?");
                System.out.println("11. Caiu no Golpe do Falso Entregador/Motoboy? Se Liga!");
                System.out.println("12. Cuidado com Ligações de Falsa Central de Atendimento");
                System.out.println("13. Golpes com Valores a Receber");
                System.out.println("14. Medidas pra Evitar Golpe com Empréstimo");
                System.out.println("15. Golpes Usando Nome do Banco Central");
                System.out.println("16. Golpes com Mensagem Swift ou Títulos do Tesouro");
                System.out.println("17. Golpes contra Prefeituras");
                System.out.println("18. Golpes envolvendo o Meu BC");
                System.out.println("Se não quiser mais ver, é só digitar [0]");

                break;


            case "1":
                System.out.println("O Banco Central não é polícia, mas fica de olho e manda os bancos ficarem espertos pra não deixar os malandro passarem a perna. Na hora de abrir conta, tem que provar que tu é tu mesmo, sem caô.\n" +
                        "\n" +
                        "As transações têm que ser blindadas, tipo cofre, e os dados da rapaziada ficam trancados pra ninguém invadir. Os bancos ainda trocam ideia pra avisar sobre golpes.\n" +
                        "\n" +
                        "No Pix, não pode cadastrar chave de quem tá enrolado com a Receita, e chave suspeita? Já sai fora!\n" +
                        "\n" +
                        "Resumindo: o BC cria as regras pra dificultar a vida dos golpistas e proteger a galera.");

                break;

            case "2":
                System.out.println("Fica ligado, mano! Nunca passa teus dados pra qualquer um, principalmente por mensagem ou ligação. Banco nunca pede senha, então se pedirem, já sabe: golpe.\n" +
                        "\n" +
                        "Confere sempre se o site ou app é verdadeiro, não clica em link estranho. E desconfia de promessa fácil demais, porque “quem promete demais, entrega de menos”.\n" +
                        "\n" +
                        "Se algo parecer errado, para, pensa e troca ideia com quem manja antes de sair fazendo.\n" +
                        "\n" +
                        "No fim, o segredo é ficar esperto e não dar mole pros malandro.");
                break;

            case "3":
                System.out.println("Se tu fez um Pix e descobriu que caiu em golpe, não vacila: já corre pra bloquear a transação, se ainda der tempo. Fala logo com teu banco pra tentar parar a grana.\n" +
                        "Também registra um boletim de ocorrência na polícia — é importante pra tentar recuperar e ajudar a pegar os malandro.\n" +
                        "E avisa a galera pra ninguém mais cair nessa cilada. Ficar esperto é a melhor defesa!");
                break;

            case "4":
                System.out.println("Se te prometeram presente, grana fácil ou coisa boa demais, desconfia na hora! Os malandro usam isso pra enganar e pegar tua grana.\n" +
                        "Nunca manda dinheiro ou dados pra quem só quer te dar “presente” — isso é cilada! Se receber essa parada, já dá um toque pra geral pra ninguém cair junto.\n" +
                        "Fica esperto e não deixa os espertinho te passar a perna.");
                break;

            case "5":
                System.out.println("Se tu fez uma TED e depois descobriu que era golpe, não perde tempo, mano! Corre pro banco na hora pra tentar bloquear essa grana antes que vá embora.\n" +
                        "Também é importante registrar boletim de ocorrência na polícia, porque isso ajuda a tentar recuperar o dinheiro e ainda pode ajudar a pegar os malandros.\n" +
                        "Fica esperto e não deixa vacilar!");
                break;

            case "6":
                System.out.println("Se alguém usou teu cartão sem tua permissão, já chama o banco pra bloquear o cartão e contestar aquela compra suspeita.\n" +
                        "Nunca deixa passar, porque quanto mais rápido agir, mais chances tem de evitar prejuízo.\n" +
                        "E não esquece de sempre checar teu extrato pra ficar ligado em qualquer movimentação estranha.");
                break;

            case "7":
                System.out.println("Antes de pagar qualquer boleto, confere se ele é legítimo, porque os golpistas adoram criar boleto falso pra tirar grana da galera.\n " +
                        "Se tu pagou um boleto errado, corre pro banco e conta o que rolou, além de registrar um boletim de ocorrência.\n" +
                        "Assim dá pra tentar impedir que os espertinhos saiam no lucro.");
                break;

            case "8":
                System.out.println("Às vezes o banco do malandro não tem dinheiro e a transferência ou pagamento cai num buraco, mano.\n " +
                        "Isso é sinal de golpe! Então não confia em conversa,\n " +
                        "sempre confirma com a instituição e nunca manda grana só porque disseram que é pra resolver “urgente”.");
                break;

            case "9":
                System.out.println("Se aparecer compra que tu não fez no cartão, não fica de bobeira!\n " +
                        "Liga logo pro banco pra bloquear o cartão e contestar aquela transação.\n " +
                        "Registra reclamação e fica de olho no que rola depois. Melhor prevenir do que perder tua grana, né?");
                break;

            case "10":
                System.out.println("Se viu cobrança em maquininha que não reconhece, já dá um toque no banco e pede pra bloquear o cartão.\n " +
                        "Golpista quer gastar teu dinheiro, mas tu tem que ser mais rápido!\n " +
                        "E sempre confere teus extratos pra pegar essas paradas rápido.");
                break;

            case "11":
                System.out.println("Se alguém apareceu dizendo que é entregador ou motoboy e pediu tua senha ou cartão, já dá um “não” na hora,\n " +
                        "parceiro! Banco nunca manda entregador pedir essas informações.\n" +
                        " Se isso acontecer, avisa teu banco e registra ocorrência pra polícia.\n " +
                        "Não dá mole pros espertinhos!");
                break;

            case "12":
                System.out.println("Se receber ligação de alguém dizendo que é do banco e pedindo tua senha ou dados, desconfia na hora.\n " +
                        "Central de atendimento de banco nunca pede essa parada por telefone.\n " +
                        "Não passa nada e, se ficar na dúvida, liga direto pro banco usando o número oficial.");
                break;

            case "13":
                System.out.println("Se apareceu mensagem ou ligação dizendo que tu tem dinheiro pra receber,\n " +
                        "mas pra pegar precisa passar dados ou pagar alguma coisa, para tudo! Isso é golpe na certa.\n " +
                        "Sempre confere direto no app oficial do banco ou site confiável, nada de acreditar em promessa fácil.");
                break;

            case "14":
                System.out.println("Quer pedir empréstimo? Só faz isso direto com banco ou financeira confiável.\n " +
                        "Nunca passa dados nem paga nada antes de assinar contrato,\n " +
                        "porque golpista adora pegar a confiança e sumir com teu dinheiro. Pesquisa, pergunta e só fecha negócio na moral.");
                break;

            case "15":
                System.out.println("Se alguém usar o nome do Banco Central pra pedir dados, senha ou dinheiro,\n" +
                        " não cai nessa! O BC não faz esse tipo de contato, então é golpe.\n" +
                        " Se receber algo assim, já desconfia e não passa informação nenhuma.");
                break;

            case "16":
                System.out.println("Recebeu mensagem falando de Swift ou títulos do Tesouro dizendo que tu tem que pagar ou passar dados? Para tudo,\n " +
                        "isso é golpe pesado. Não responde nem clica em nada, e avisa a polícia ou o banco oficial.");
                break;

            case "17":
                System.out.println("Se aparecer oferta estranha usando o nome da prefeitura pra pedir dinheiro,\n " +
                        "é golpe! Confirma tudo no site oficial da prefeitura ou indo lá na moral.\n " +
                        "Não cai na conversa dos malandro que só querem tirar tua grana.");
                break;

            case "18":
                System.out.println("Se receber mensagem ou ligação sobre “Meu BC” pedindo dados ou dinheiro, não confia, não! \n" +
                        "Usa só o app oficial do Banco Central pra mexer nessas paradas.\n" +
                        "Golpista adora fingir que é o BC pra enganar a galera.");
                break;

            case "0":
                System.out.println("Saindo do programa...");
                break;

            default:
                System.out.println("Meu Deus! Você está vendo essa lista ou esse número aí?");


        }

        }while (!nome.equals("0"));



    }
}