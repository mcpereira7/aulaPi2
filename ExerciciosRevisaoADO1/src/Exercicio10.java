
import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {

    static int tamanho() {
        Scanner sc = new Scanner(System.in);
        int tamanhoMatriz;
        System.out.println("Tamanho matriz");
        System.out.println("Linha / Coluna: ");
        tamanhoMatriz = sc.nextInt();
        return tamanhoMatriz;
    }

    static int[][] criaMatriz(int linha, int coluna) {
        //System.out.println("Criar Matriz");
        int[][] matriz = new int[linha][coluna];
        return matriz;
    }

    static int[][] populaMatriz(int[][] matriz) {
        Random rd = new Random();
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(10);

            }
        }
        return matriz;
    }

    static int[][] somaMatriz(int[][] matrizA, int[][] matrizB, int[][] matrizResultadoSomaMatriz) {

        for (int i = 0; i < matrizResultadoSomaMatriz.length; i++) {
            for (int j = 0; j < matrizResultadoSomaMatriz[i].length; j++) {
                matrizResultadoSomaMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizResultadoSomaMatriz;
    }

    public static void main(String[] args) {
        int tamanhoMatriz = tamanho();
        int[][] matrizA = criaMatriz(tamanhoMatriz, tamanhoMatriz);
        int[][] matrizB = criaMatriz(tamanhoMatriz, tamanhoMatriz);
        int[][] matrizResultadoSomaMatriz = criaMatriz(tamanhoMatriz, tamanhoMatriz);

        matrizA = populaMatriz(matrizA);
        matrizB = populaMatriz(matrizB);
        matrizResultadoSomaMatriz=somaMatriz(matrizA,matrizB,matrizResultadoSomaMatriz);
        System.out.println("Matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                System.out.printf("\t" + matrizA[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n####################################################");
        System.out.println("Matriz A");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {

                System.out.printf("\t" + matrizB[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n####################################################");
        System.out.println("Soma dos valores das Matrizes A e B");
        for (int i = 0; i < matrizResultadoSomaMatriz.length; i++) {
            for (int j = 0; j < matrizResultadoSomaMatriz[i].length; j++) {

                System.out.printf("\t" + matrizResultadoSomaMatriz[i][j]);
            }
            System.out.println("");
        }
    }
}
