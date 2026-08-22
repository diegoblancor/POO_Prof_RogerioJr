package Exercicios;

public class matriz {

    public static void main(String[] args) {

        // declarando vetor
        int [] vetor = new int[10];

        // declarando matriz (4 linhas e 3 colunas)
        int [][] matriz = new int [4] [3];

        // inserir informação - inserir na linha e coluna
        matriz [2] [2] = 5;

        // outras inserções
        matriz [1] [2] = 25;
        matriz [1] [1] = 10;
        matriz [0] [2] = 7;

        // Laço para percorrer as linhas
        for (int i = 0; i < matriz.length; i++) {
            // Laço para percorrer as colunas
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha ao fim de cada linha da matriz
        }
    }
}
