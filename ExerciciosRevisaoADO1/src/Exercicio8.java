
import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior=0,qtdnumero=0, cont=0;
        int [] numeros;
            System.out.print("Informe a quantidade de números que deseja digitar: ");
            qtdnumero = sc.nextInt();
            numeros = new int [qtdnumero];
            for(int i=0; i<numeros.length; i++){
                System.out.printf("digite o %dº número: ", (i+1));
            numeros[i]=sc.nextInt();
            if(numeros[i]>maior){
                maior=numeros[i];
                cont++;
                }
            }
        
        System.out.println("O maior número digitado foi: "+maior);
        System.out.println("Ele foi digitado na rodada: "+cont);
        
    }
    
}
