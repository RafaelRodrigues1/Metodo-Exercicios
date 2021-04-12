package metodoexercicios;

import java.util.Scanner;

/**
 *Crie um método que recebe uma matriz bidimensional double e retorna a quantidade
 *  de linhas da matriz.
 * @author RafaelRodrigues1
 */
            
public class MetodoExercicios1 {
    
    public static Integer metodoLinha(Integer[][] matriz) {
        int i=0;
        for(Integer a[]: matriz){
            i++;
            for(Integer b: a){
            }           
        }return i;
    }
    
    public static void preencheMatriz(Integer[][]matriz){
        System.out.print("Insira números para preencher a matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = new Scanner(System.in).nextInt();
            }
        }    
    }
    
    public static void imprimeMatriz(Integer[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
       System.out.print("Insira o número de linhas da matriz: ");
       int linha = new Scanner(System.in).nextInt();
       Integer matriz[][] = new Integer[linha][5];
       double a = metodoLinha(matriz);
       System.out.println("O número de linhas é " + a);
    }
    
}
