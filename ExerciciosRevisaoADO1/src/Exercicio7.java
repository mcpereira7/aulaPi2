
import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int alunos=0;
    double mediasFinais=0;
        System.out.printf("Informe a quantidade de alunos: ");
        alunos=sc.nextInt();
        
        for(int i =1; i <=alunos; i++){
            System.out.printf("Informe a média do %dº aluno: ", i);
            mediasFinais += sc.nextDouble();
        }

        System.out.printf("A média da classe é: %.2f",(mediasFinais/alunos));
        System.out.println("");
}    
    
}
