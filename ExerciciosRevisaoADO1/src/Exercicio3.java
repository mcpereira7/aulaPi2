
import java.util.Scanner;


public class Exercicio3 {
    public static int lerNumero(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número Decinal: ");
        numero = sc.nextInt();
        return numero;
    }
    
    static boolean  validarNumero(int numero){
        boolean status = (numero>=0 || numero<=9);
        if(!status){
            System.out.println("ERRO AO PROCESSAR VALOR DIGITADO NÃO É ACEITO!");
            status = false;
        }
        return status;
    }
    
}
