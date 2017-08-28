
public class Exercicio6 {
    
    public static void main(String[] args) {
        int [][] tabuada = new int[10][10];
        
        for(int i=1; i<tabuada.length; i++){
            for(int j=1; j<tabuada[i].length; j++){
                tabuada[i][j]=(i*j);
            }
        }
        for(int i=1; i<2; i++){
            System.out.print("* |");
            for(int j=1; j<tabuada[i].length; j++){
                System.out.print("\t"+j);
            }
            System.out.println("");
        }
        for(int i=1; i<2; i++){
            for(int j=1; j<tabuada[i].length; j++){
                System.out.printf("--------");
            }
            System.out.println("");
        }
        for(int i=1; i<tabuada.length;i++){
            System.out.printf(i+" |");
            for(int j=1;j<tabuada[i].length; j++){
               // 
                //System.out.printf("\t-");
                System.out.printf("\t"+tabuada[i][j]);
            }
            System.out.println("");
        }
    }
    
    
}
