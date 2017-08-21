
import java.util.Scanner;

public class Exercicio2 {

    public static String lerNumero() {
        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.print("Digite um número Inteiro Positivo: ");
        numero = sc.nextLine();

        return numero;
    }
    public static int validarNumero(String numeroNaoValidado){
        int numero=0;
        if (numeroNaoValidado.matches("[0-9]{"+numeroNaoValidado.length()+"}")){
            numero= Integer.parseInt(numeroNaoValidado);
        } else{
            System.out.println("Valor digitado é inválido!");
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
        String ehPrimo = "NÃO é número Primo";

        /*if (numero == 2) {
            ehPrimo = "É Primo";
        }*/
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                contador++;
            }
            divisor++;
        }
        if (contador == 2) {
            ehPrimo = "é número Primo";
        }
        return ehPrimo;
    }

    public static void main(String[] args) {
        String numeroNaoValidado = lerNumero();
        int numero = validarNumero(numeroNaoValidado);
        if(numero>0){
        String parOuImpar = validarParImpar(numero);
        String ehPrimo = verificaPrimo(numero);
        System.out.println(numero + " é um número " + parOuImpar + "\ne " + ehPrimo);
        }else{
            System.out.println("Tente novamente!");
        }
        
    }
}
