
import java.util.Scanner;


public class Exercicio3 {
    public static int lerNumero(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número de 0 a 9: ");
        numero = sc.nextInt();
        return numero;
    }
    
    static boolean  validarNumero(int numero){
        boolean status=true;
        if(numero<0 || numero>9){
            System.out.println("ERRO AO PROCESSAR VALOR DIGITADO NÃO É ACEITO!");
            status = false;
        }
        return status;
    }
    
    public static String numeroPorExtenso(int numero){
        String [] numExtenso = new String[10];
        
        numExtenso[0]="ZERO";
        numExtenso[1]="UM";
        numExtenso[2]="DOIS";
        numExtenso[3]="TRÊS";
        numExtenso[4]="QUATRO";
        numExtenso[5]="CINCO";
        numExtenso[6]="SEIS";
        numExtenso[7]="SETE";
        numExtenso[8]="OITO";
        numExtenso[9]="NOVE";
        String vlrNumExtenso = numExtenso[numero];
        return vlrNumExtenso;
    }
    
    public static void main(String[] args) {
        int numero = lerNumero();
        boolean status = validarNumero(numero);
        
        if (status){
            String valorExtenso = numeroPorExtenso(numero);
            System.out.printf("Valor por extenso de %d é %s \n\n",numero,valorExtenso);
        }
    }
}
