
import java.util.Scanner;


public class Exercicio1 {
    public static double lerNumero(){
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número Decinal: ");
        numero = sc.nextDouble();
        return numero;
    }
    public static String verificarNumero(double numero){
        String resultado="ERRO";
        if(numero==50.0){
            resultado="SUCESSO";
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        double numero = lerNumero();
        String status = verificarNumero(numero);
        System.out.println(status);
        System.out.println("FIM DO PROGRAMA");
    }
    
}
