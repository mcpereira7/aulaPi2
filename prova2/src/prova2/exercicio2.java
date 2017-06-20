package prova2;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("Populando a matriz com Random tamanho 10 + 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(10 + 1);
            }
        }
        return matriz;
    }

    static void verificaElementoMatriz(int[][] matriz, int elemento) {
        System.out.printf("Verificando se %d existe na matriz \n", elemento);
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (elemento == matriz[i][j]) {
                    contador++;
                    System.out.printf("O elemento %d existe na posição [%d][%d]\n", elemento, i, j);
                }
            }
        }
        System.out.printf("%d aparece %d vezes na matriz\n", elemento, contador);
    }

    public static void main(String[] args) {
        int n, m, num;
        System.out.print("Informe o número de linhas da matriz: ");
        n = sc.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        m = sc.nextInt();
        int[][] matriz = new int[n][m];
        matriz = populaMatriz(matriz);
        System.out.print("informe o número que deseja verificar se existe na matriz criada:");
        num = sc.nextInt();
        verificaElementoMatriz(matriz, num);
    }
}
