
package metodoexercicios;

import java.util.Scanner;

/**
 *Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica
 *uma de suas linhas, e retorna a média dos valores daquela linha.
 * @author RafaelRodrigues1
 */
public class MetodoExercicios4 {
    
    public static Double metodoMediaLinha(Integer[][]matriz, int linha){
        int soma = 0, i;
        double media;
        for(i = 0; i < matriz[linha].length; i++){
            soma+=matriz[linha][i];
        }
        media = ((double)soma/(double)i);
        return media;
    }
    
    public static void main(String[] args) {
        Integer matriz[][] = new Integer[4][4];
        MetodoExercicios1.preencheMatriz(matriz);
        MetodoExercicios1.imprimeMatriz(matriz);
        System.out.println("Digite a linha que deseja calcular a média: ");
        int linha = new Scanner(System.in).nextInt();
        Double result = metodoMediaLinha(matriz, linha-1);
        System.out.println("A média da linha " + linha + " é " + result);
    }
}
