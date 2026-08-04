import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma = soma + vetor[i];
        }

        System.out.println("A soma dos elementos e: " + soma);

        scanner.close();
    }
}