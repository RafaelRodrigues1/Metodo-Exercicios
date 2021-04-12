package metodoexercicios;

import java.util.Scanner;

/**
 *Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.
 * @author RafaelRodrigues1
 */
public class MetodoExercicios3 {
    
    public static Integer metodoSomaMatriz(Integer[][] matriz){
        int soma = 0;
        for(Integer i[]: matriz){
            for(Integer j: i){
                soma += j;
            }
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Integer matriz[][] = new Integer[3][3];
        MetodoExercicios1.preencheMatriz(matriz);
        MetodoExercicios1.imprimeMatriz(matriz);
        int soma = metodoSomaMatriz(matriz);
        System.out.println("A soma dos números da matriz é: " + soma);
    }
           
}
