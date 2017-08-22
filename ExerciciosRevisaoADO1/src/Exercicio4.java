
import java.util.Scanner;

public class Exercicio4 {

    public static double[] valoresDaMedia() {
        Scanner sc = new Scanner(System.in);
        double[] valoresMedia = new double[5];
        for (int i = 0; i < valoresMedia.length; i++) {
            System.out.print("Informe a nota na posição " + (i + 1) + ": ");
            valoresMedia[i] = sc.nextDouble();
        }
        return valoresMedia;
    }

    public static double calcularMedia(double[] valoresMedia) {
        double media, soma = 0;
        for (int i = 0; i < valoresMedia.length; i++) {
            soma = soma + valoresMedia[i];

        }
        media = soma / valoresMedia.length;

        return media;
    }

    public static void main(String[] args) {
        double[] valoresMedia = valoresDaMedia();
        double media = calcularMedia(valoresMedia);
        System.out.println("Sua média foi: " + media);
        if (media < 5) {
            System.out.println("REPROVADO");
        } else if (media >= 5 && media < 9) {
            System.out.println("APROVADO");
        } else if (media >= 9 && media < 10) {
            System.out.println("PARABÉNS");
        } else if (media >= 10) {
            System.out.println("MASTER OF THE UNIVERSE");
        }
    }

}
