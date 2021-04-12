package metodoexercicios;

import java.util.Scanner;

/**
 *Crie um método que recebe uma matriz bidimensional integer e retorna o maior valor da matriz.
 *@author RafaelRodrigues1
 */
public class MetodoExercicios2 {
    
    public static Integer metodoMaior(Integer[][] matriz){
        Integer maior = Integer.MIN_VALUE;
            for(Integer i[]: matriz){
                for(Integer j: i){
                    if(j>maior){
                        maior=j;
                    }
                }
            }
            return maior;
    }
    
    
    public static void main(String[] args) {
        Integer matriz[][] = new Integer[3][3];
        MetodoExercicios1.preencheMatriz(matriz);
        MetodoExercicios1.imprimeMatriz(matriz);
        Integer maiorNum = metodoMaior(matriz);
        System.out.println("O maior número da matriz é :" + maiorNum);
    }
}
