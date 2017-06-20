package prova2;

import prova2.*;

public class exercicio3 {

    static double produtoElementosImpares(double[] vetor) {
        System.out.println("Multiplicando os elementos em posição ÍMPAR");
        double produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                produto = produto * vetor[i];
            }
        }
        System.out.println("Resultado da multiplicação: " + produto + "\n");
        return produto;
    }

    static double somaElementosPares(double[] vetor) {
        System.out.println("Somando os elementos em posição PAR");
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                soma = soma + vetor[i];
            }
        }
        System.out.println("Resultado da soma = " + soma + "\n");
        return soma;
    }

    static double divisaoElementos(double soma, double produto) {
        System.out.println("\nEfetuando divisão do produto dos elementos em posição ímpar \n"
                + "pela soma dos elementos em posição par");
        double divisao = produto / soma;

        return divisao;
    }

    static void imprimeFuncao(double divisao) {
        System.out.println("\nO resultado da divisão é");
        System.out.println(divisao);
    }

    public static void main(String[] args) {
        double[] vetor = new double[10];
        double soma, produto, divisao;
        vetor = Prova2.populaVetorDouble(vetor);
        soma = somaElementosPares(vetor);
        produto = produtoElementosImpares(vetor);
        divisao = divisaoElementos(soma, produto);
        imprimeFuncao(divisao);
    }
}
