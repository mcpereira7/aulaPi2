
import java.util.Scanner;

public class Exercicio2 {

    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        String valor;
        System.out.print("Digite um número Inteiro Positivo: ");
        valor = sc.nextLine();
        numero = Integer.parseInt(valor);
        if (!valor.matches("[0-9][" + valor.length() + "]")) {
            do {
                System.out.print("Digite um número Inteiro Positivo: ");
                valor = sc.nextLine();
                numero = Integer.parseInt(valor);
            } while (numero < 0);
        }

        return numero;
    }

    public static String validarParImpar(int numero) {
        String resultadoParImpar = "IMPAR";
        if (numero % 2 == 0) {
            resultadoParImpar = "PAR";
        }
        return resultadoParImpar;
    }

    public static String verificaPrimo(int numero) {
        int divisor = 1,
                contador = 0;
        String ehPrimo = "Não é Primo";

        if (numero == 2) {
            ehPrimo = "É Primo";
        }
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                contador++;
            }

        }
        if (contador == 2) {
            ehPrimo = "É Primo";
        }
        return ehPrimo;
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        String parOuImpar = validarParImpar(numero);
        String ehPrimo = verificaPrimo(numero);
        System.out.println(numero + " " + parOuImpar + " e " + ehPrimo);
    }
}
