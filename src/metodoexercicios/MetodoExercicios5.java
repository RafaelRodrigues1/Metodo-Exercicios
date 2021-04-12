package metodoexercicios;

/**
 *Crie um método que recebe uma matriz de inteiros positivos e substitui seus
 *elementos de valor ímpar por -1 e os pares por +1.
 * @author RafaelRodrigues1
 */
public class MetodoExercicios5 {
    
    public static Integer[][] SubParImpar(Integer[][]matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[i][j]%2==0){
                    matriz[i][j]=1;
                }else if(matriz[i][j]%2==1){
                    matriz[i][j]=-1;
                }
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        Integer matriz[][] = new Integer[4][4];
        MetodoExercicios1.preencheMatriz(matriz);
        System.out.println("Antes da função par ímpar");
        MetodoExercicios1.imprimeMatriz(matriz);
        matriz = SubParImpar(matriz);
        System.out.println("Depois da função par ímpar");
        MetodoExercicios1.imprimeMatriz(matriz);                
    }
}
