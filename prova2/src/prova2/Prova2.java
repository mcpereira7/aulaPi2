package prova2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class Prova2 {

    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    static double[] populaVetorDouble(double[] vetorD) {
        System.out.println("Populando o Vetor");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.printf("Digite o valor da posição %d: ",i);
            vetorD[i] = sc.nextDouble();
        }
        return vetorD;
    }

    public static void main(String[] args) {

        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double menorA=1000, menorB=1000;
        
        System.out.println("Digite os valores para o vetor A");
        vetorA = populaVetorDouble(vetorA);
        System.out.println("Digite os valores para o vetor B");
        vetorB = populaVetorDouble(vetorB);
        
        for(int i = 0; i<5; i++){
            if(vetorA[i]<menorA){
                menorA=vetorA[i];
            }
            if(vetorB[i]<menorB){
                menorB=vetorB[i];
            }
        }
        System.out.println("O menor valor de vetorA = "+menorA);
        System.out.println("O menor valor de vetorB = "+menorB);
        System.out.println("A divisão entre eles é = " + (menorA/menorB));

    }

}
