import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        boolean crescente = true;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("O vetor esta em ordem crescente");
        } else {
            System.out.println("O vetor NAO esta em ordem crescente");
        }

        scanner.close();
    }
}