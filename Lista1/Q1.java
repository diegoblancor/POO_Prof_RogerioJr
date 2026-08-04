import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

        scanner.close();
    }
}