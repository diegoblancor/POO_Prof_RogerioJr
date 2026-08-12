package Exemplos;

public class matriz {

    static void main() {

        //declarando vetor
        int [] vetor = new int[10];

        //declarando matriz
        int [][] matriz = new int [4] [3];

        //inserir informação - inserir na linha e coluna
        matriz [2] [2] = 5;
        
        //outras inserções
        matriz [1] [2] = 25;
        matriz [1] [1] = 10;
        matriz [0] [2] = 7;

        for (int = 0; i < matriz.length; i++); {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][i] + " ");
            }
        }

        System.out.println();
        

    }
    
}
