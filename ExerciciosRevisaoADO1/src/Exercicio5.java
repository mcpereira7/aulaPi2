
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    //gerar número aleatório de 0 a 10
    public static int gerarNumeroRandon() {
        Random rd = new Random();
        int numero = rd.nextInt(11);
        return numero;
    }

    //ler número do usuário
    public static String lerNumeroUser() {
        Scanner sc = new Scanner(System.in);
        String numero;
        System.out.println("Jogo Adivinhar Número");
        System.out.print("Informe um número Inteiro: ");
        numero = sc.nextLine();
        return numero;
    }

    //validar número - verifica se valor é um número inteiro
    public static int validarNumero(String numeroNaoValidado) {
        int numero = 0;
        if (numeroNaoValidado.matches("[0-9]{" + numeroNaoValidado.length() + "}")) {
            numero = Integer.parseInt(numeroNaoValidado);
        } else {
            System.out.println("Valor digitado é inválido!");
        }

        return numero;
    }

    public static void main(String[] args) {
        int numeroRandom = gerarNumeroRandon();
        int numero = 0, cont = 1;
        String numeroUser;
        boolean acertou = false;

        do {

            numeroUser = lerNumeroUser();
            if (numeroUser.equalsIgnoreCase("desistir")) {
                System.out.println("Não foi desta vez, o número correto era: " + numeroRandom);
                break;
            }
            numero = validarNumero(numeroUser);
            if (numero==numeroRandom) {
                acertou=true;
                System.out.println("Parabéns!!! Você acertou na tentativa " + cont);
            }
            cont++;

        } while (!acertou);
    }
}
