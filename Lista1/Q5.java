import java.util.Scanner;

public class Q5 {

    public static double calcularEncargos(double horas) {
        double tarifa;

        if (horas <= 3) {
            tarifa = 2.00;
        } else {
            tarifa = 2.00 + (horas - 3) * 0.50;
        }

        return tarifa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horas;
        double tarifaCliente;
        double totalDia = 0;

        System.out.println("Digite as horas de cada cliente (digite 0 para encerrar):");

        System.out.print("Horas: ");
        horas = scanner.nextDouble();

        while (horas != 0) {
            tarifaCliente = calcularEncargos(horas);

            System.out.printf("Tarifa do cliente: R$ %.2f%n", tarifaCliente);

            totalDia = totalDia + tarifaCliente;

            System.out.print("Horas: ");
            horas = scanner.nextDouble();
        }

        System.out.printf("Total arrecadado no dia: R$ %.2f%n", totalDia);

        scanner.close();
    }
}