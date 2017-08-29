
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String opcao = "", diaSemana = "";

        //Criando a matriz e populando com os valores default
        String[][] agendaSemanal = new String[3][5];
        agendaSemanal[0][0] = "Segunda";
        agendaSemanal[0][1] = "Terça";
        agendaSemanal[0][2] = "Quarta";
        agendaSemanal[0][3] = "Quinta";
        agendaSemanal[0][4] = "Sexta";
        //Preenchendo NULOS com traços - 
        for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 5; j++) {
                        agendaSemanal[i + 1][j] = "---";
                    }
                    System.out.println("");
                }

        while (!exit) {
            // mostrando menu e Solicitando que o mesmo escolha uma opção
            System.out.println("1 - Cadastrar Matérias\n"
                    + "2 - Ver Matérias por dia\n"
                    + "3 - Exibir agenda completa\n"+
                    "Digite SAIR a qualquer momento para encerrar o programa!");
            System.out.printf("Digite uma Opção: ");
            opcao = sc.nextLine();
            System.out.println("");

            if (opcao.equals("1")) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("Infome a aula do %d horário de %s: ", (i + 1), agendaSemanal[0][j]);
                        agendaSemanal[i + 1][j] = sc.nextLine();
                    }
                    System.out.println("");
                }
            } else if (opcao.equals("2")) {
                System.out.println("Qual dia da Semana gostaria de consultar?\n"
                        + "Segunda | Terça | Quarta | Quinta | Sexta");
                diaSemana = sc.nextLine().toUpperCase();
                switch (diaSemana) {
                    case "SEGUNDA":
                        //System.out.println(agendaSemanal[0][0]);
                        System.out.println(agendaSemanal[1][0]);
                        System.out.println(agendaSemanal[2][0]);
                        break;
                    case "TERÇA":
                        // System.out.println(agendaSemanal[0][1]);
                        System.out.println(agendaSemanal[1][1]);
                        System.out.println(agendaSemanal[2][1]);
                        break;
                    case "QUARTA":
                        // System.out.println(agendaSemanal[0][2]);
                        System.out.println(agendaSemanal[1][2]);
                        System.out.println(agendaSemanal[2][2]);
                        break;
                    case "QUINTA":
                        // System.out.println(agendaSemanal[0][3]);
                        System.out.println(agendaSemanal[1][3]);
                        System.out.println(agendaSemanal[2][3]);
                        break;
                    case "SEXTA":
                        // System.out.println(agendaSemanal[0][4]);
                        System.out.println(agendaSemanal[1][4]);
                        System.out.println(agendaSemanal[2][4]);
                        break;
                    case "SAIR":
                        exit=true;
                        continue;
                    
                    default:
                        System.out.println("DIA INVÁLIDO");
                        break;
                }
            } else if (opcao.equals("3")) {

//Imprime a agenda completa
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("\t" + agendaSemanal[i][j]);
                    }
                    System.out.println("");
                }
            }
            if(opcao.equalsIgnoreCase("sair")){
                exit=true;
            }
        }
    }
}
